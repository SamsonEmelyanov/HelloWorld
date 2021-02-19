package com.javacourse.se.lesson8;

import java.util.*;
import java.util.concurrent.Future;

public class CollectionsRunner {
    public static void main(String[] args) {
        List<Card> deckOfCards = new ArrayList<>();
        for (Card.Face face : Card.Face.values()) {
            for (Card.Suit suit : Card.Suit.values()) {

                deckOfCards.add(new Card(suit, face));
            }
        }
        System.out.println("Original deck of cards");
        printOutput((List<Card>) deckOfCards);
        System.out.println(" ");

        Collections.shuffle(deckOfCards);
        Collections.sort(deckOfCards);/*BinarySearch will not work with unsorted deck of cards!!!*/
        Card card = new Card(Card.Suit.SPADES, Card.Face.Queen);
        int i = Collections.binarySearch(deckOfCards, card);
        if (i >= 0) {
            System.out.println(card + "-> Card was found at position №" + i);
        } else System.out.println(card + "-> Card was not found");

        int cardListCapacity = 52;
        List<Card> cardList = new ArrayList<>(cardListCapacity);

        for (int j = 0; j < cardListCapacity; j++) {
            cardList.add(null);
        }

        Collections.fill(cardList, card);
        Collections.addAll(cardList, new Card(Card.Suit.CLUMBS, Card.Face.Deuce), new Card(Card.Suit.DIMONDS, Card.Face.Jack), new Card(Card.Suit.HEARTS, Card.Face.Four));
        Collections.copy(cardList, deckOfCards);
        System.out.println("\ncardList array is");
        printOutput(cardList);
        System.out.println("\nFrequency of " + card + " is " + Collections.frequency(deckOfCards, card)); /*Must to override equals and hashcode methods!!!*/
        System.out.println("MIN:" + Collections.min(cardList));
        System.out.println("MAX:" + Collections.max(cardList));

        System.out.println(" ");
        System.out.println("Shuffled deck of cards");
        printOutput(deckOfCards);

        /*Collections.sort(deckOfCards);*/
        /*Collections.sort(deckOfCards,Collections.reverseOrder());*/
        Collections.sort(deckOfCards, new CardComparator()); /*Choose sort method*/
        System.out.println(" ");
        System.out.println("Sorted deck of cards");
        printOutput(deckOfCards);
    }

    private static void printOutput(List<Card> deckOfCards) {
        for (int i = 0; i < deckOfCards.size(); i++) {
            System.out.printf("%-20s %s", deckOfCards.get(i), (i + 1) % 4 == 0 ? "\n" : " ");
        }
    }

    public static class Card implements Comparable<Card> {
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Card card = (Card) o;
            return suit == card.suit &&
                    face == card.face;
        }

        @Override
        public int hashCode() {
            return Objects.hash(suit, face);
        }

        private enum Suit {SPADES, HEARTS, CLUMBS, DIMONDS}

        private enum Face {Ace, Deuce, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King}

        private final Suit suit;
        private final Face face;

        public Card(Suit suit, Face face) {
            this.suit = suit;
            this.face = face;
        }

        public Suit getSuit() {
            return suit;
        }

        public Face getFace() {
            return face;
        }

        @Override
        public int compareTo(Card card) {

            Face[] values = Face.values();
            List<Face> faces = Arrays.asList(values);

            if (faces.indexOf(this.face) < faces.indexOf(card.getFace())) {
                return -1;
            } else if (faces.indexOf(this.face) > faces.indexOf(card.getFace())) {
                return 1;
            } else if (faces.indexOf(this.face) == faces.indexOf(card.getFace())) {
                return String.valueOf(suit).compareTo(String.valueOf(card.getSuit()));
            }
            return 0;
        }

        @Override
        public String toString() {
            return face + " of " + suit;
        }
    }

    public static class CardComparator implements Comparator<Card> {

        List<Card.Face> faces = Arrays.asList(Card.Face.values());

        @Override
        public int compare(Card card1, Card card2) {

            if (faces.indexOf(card1.getFace()) < faces.indexOf(card2.getFace())) {
                return 1;
            } else if (faces.indexOf(card1.getFace()) > faces.indexOf(card2.getFace())) {
                return -1;
            } else if (faces.indexOf(card1.getFace()) == faces.indexOf(card2.getFace())) {
                return String.valueOf(card1.getSuit()).compareTo(String.valueOf(card2.getSuit()));
                /*return 0;*/
            }
            return 0;
        }
    }
}


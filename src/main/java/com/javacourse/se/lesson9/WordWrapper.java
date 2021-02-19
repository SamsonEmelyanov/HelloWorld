package com.javacourse.se.lesson9;

import java.util.Objects;

public class WordWrapper implements Comparable<WordWrapper> {
    private final String word;
    private final Integer count;

    public WordWrapper(String word, Integer count) {
        this.word = word;
        this.count = count;
    }

    public String getWord() {
        return word;
    }

    public Integer getCount() {
        return count;
    }

    @Override
    public int compareTo(WordWrapper thatWord) { //"thatWord" was "word"

        if (count < thatWord.getCount()) {
            return 1; // according specification should to use "-1"
        }
        if (count > thatWord.getCount()) {
            return -1; // according specification should to use "+1"
        }
        /*return 0;*/
        return word.compareTo(thatWord.getWord()); // was return 0;
    }

    @Override
    public String toString() {
        return word + " -> " + count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WordWrapper that = (WordWrapper) o;
        return Objects.equals(word, that.word) &&
                Objects.equals(count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word, count);
    }
}


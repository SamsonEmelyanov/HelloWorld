package CharArraySorting;

import java.util.Arrays;

public class ChoosingMethod {
    public static void main(String[] args) {
        int[] arr = {4, 4, 9, 2, 3,2,6,78,5,3,5,7,8,4,1,2,4,5,67,8,9};
        /*
         * По очереди будем просматривать все подмножества элементов массива (0 -
         * последний, 1-последний, 2-последний,...)
         */
        for(int i = 0;i<arr.length;i++) {
            /*
             * Предполагаем, что первый элемент (в каждом подмножестве элементов)
             * является минимальным
             */
            int min = arr[i];
            int min_i = i;
            /*
             * В оставшейся части подмножества ищем элемент, который меньше
             * предположенного минимума
             */
            for (int j = i + 1; j < arr.length; j++) {
                // Если находим, запоминаем его индекс
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
            /*
             * Если нашелся элемент, меньший, чем на текущей позиции, меняем их
             * местами
             */
            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
            System.out.println(arr[i]);
        }

    }

}

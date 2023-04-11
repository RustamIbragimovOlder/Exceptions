// Реализовать метод, принимающий в качестве аргумента целочисленный двумерный массив.
// Необходимо посчитать и вернуть сумму элементов этого массива.
// Накладываем на метод два ограничения:
// 1. метод может работать только с квадратными массивами (количество строк = количеству столбцов);
// 2. в каждой ячейке может лежать только значение 0 или 1.

package seminar1;

import java.util.Random;

public class example2 {

    public static void main(String[] args) {
        int[][] array = new int[5][5];
        // int[][] array = {{1, 1, 0, 1}, {0, 1, 0, 1}, {1, 0, 1, 1}, {1, 1, 1, 0}};
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(2);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.printf("Сумма элементов => %d", ex2(array));
        System.out.println();

    }

    private static int ex2(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != arr.length) {
                throw new RuntimeException("Массив не квадратный!");
            }
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] != 0 && arr[i][j] != 1) {
                    throw new RuntimeException("В массиве есть элементы, отличные от 0 и 1!");
                }
                sum += arr[i][j];
            }
        }
        return sum;
    }
    
}

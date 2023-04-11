// Реализовать метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
// Метод ищет в массиве заданное значение и возвращает его индекс.
// При этом:
// 1. если длина массива меньше заданного минимимума - метод возвращает -1 в качестве кода ошибки;
// 2. если искомый элемент не найден - метод возвращает -2 в качестве кода ошибки;
// 3. если вместо массива пришел null - метод возвращает -3 в качестве кода ошибки;
// 4. другие свои варианты.
// Напишите метод взаимодействия с пользователем (запрос числа, вызов метода, обработка, возврат результата с пояснениеями)

package seminar1;

import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {
        ex1();
    }

    private static void ex1() {
        int[] array = { 4, 2, 6, 7, 8, 3, 2, 1, 7 };
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для поиска: => ");
        int value = scanner.nextInt();
        int index = searchNum(array, value);
        switch (index) {
            case -1 -> System.out.println("Длина массива менее 3");
            case -2 -> System.out.println("Искомое число не найдено");
            case -3 -> System.out.println("Массив не может быть null");
            default -> System.out.printf("Искомое число %s находится под индексом %s%n", value, index);
        }
        System.out.println();
        scanner.close();
    }

    private static int searchNum(int[] array, int value) {
        if (array == null) {
            return -3;
        }
        if (array.length < 3) {
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -2;
    }
    
}
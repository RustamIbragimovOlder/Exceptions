// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
// и возвращающий новый массив,
// каждый элемент которого равен сумме элементов двух входящих массивов в той же ячейке.
// Если длины массивов не равны, необходимо как-то оповестить пользователя.

package PracticalTask1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PT2 {
    
    public static void main(String[] args) {
        Integer[] array1 = new Integer[] { 0, 1, 2, 3, 4, 5 };
        Integer[] array2 = new Integer[] { 5, 4, 3, 2, 1, 0 };
        Integer[] array3 = new Integer[] { 0, 1, 2, 3, 4, 5, 6 };
        System.out.println("Массив 1 => " + Arrays.asList(array1));
        System.out.println("Массив 2 => " + Arrays.asList(array2));
        System.out.println("Массив 3 => " + Arrays.asList(array3));
        System.out.println("Сумма массива 1 и 2 => " + addingArrays(array1, array2));
        System.out.println("Сумма массива 2 и 3 => " + addingArrays(array2, array3));
    }

    public static List<Integer> addingArrays(Integer[] arr1, Integer[] arr2) {
        List <Integer> result = new ArrayList<>();
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                int sum = arr1[i] + arr2[i];
                result.add(sum);
            }
        } else {
            // вывод сообщения в консоль
            System.out.println("Сложение невозможно. Длины массивов не равны.");
            // вывод исключения
            throw new RuntimeException("Сложение невозможно. Длины массивов не равны!");
        }
        return result;
    }

}

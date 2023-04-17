// 1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4,
// при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
// 2. Далее метод должен пройтись по всем элементам массива,
// преобразовать в int, и просуммировать.
// Если в каком-то элементе массива преобразование не удалось
// (например, в ячейке лежит символ или текст вместо числа),
// должно быть брошено исключение MyArrayDataException,
// с детализацией в какой именно ячейке лежат неверные данные.
// 3. В методе main() вызвать полученный метод,
// обработать возможные исключения MyArraySizeException и MyArrayDataException
// и вывести результат расчета (сумму элементов),
// при условии что подали на вход корректный массив.

package PracticalTask3;

public class Main {

    private static final String errorSizeArray = "Неправильный размер! Размер массива должен быть 4x4.";
    private static final String errorDataElement = "Преобразование в int невозможно! Это не число.";
    private static final String sumElementsArray = "Сумма элементов массива = ";

    public static void main(String[] args) {
        String[][] array1 = {
                { "1", "5", "10", "14" },
                { "2", "6", "11", "15" },
                { "3", "7", "12", "16" },
                { "4", "8", "13", "17" },
        };
        String[][] array2 = {
                { "1", "5", "10", "14", "18" },
                { "2", "6", "11", "15", "19" },
                { "3", "7", "12", "16", "20" },
                { "4", "8", "13", "17", "21" },
        };
        String[][] array3 = {
                { "1", "5", "10", "14" },
                { "2", "6", "err", "15" },
                { "3", "7", "12", "16" },
                { "4", "8", "13", "17" },
        };

        try {
            System.out.println(sumStr(array1));
        } catch (MyArrayExceptions e) {
            e.printStackTrace();
        }

        try {
            System.out.println(sumStr(array2));
        } catch (MyArrayExceptions e) {
            e.printStackTrace();
        }

        try {
            System.out.println(sumStr(array3));
        } catch (MyArrayExceptions e) {
            e.printStackTrace();
        }
    }

    private static void checkSize(String[][] arr) throws MyArraySizeException {

        if (arr.length != 4) {
            throw new MyArraySizeException(errorSizeArray);
        }
        for (String[] strings : arr) {
            if (strings.length != 4) {
                throw new MyArraySizeException(errorSizeArray);
            }
        }

    }

    private static void checkInt(String[][] arr) throws MyArrayDataException {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(errorDataElement + " Ошибка в элементе с индексом [" + i + "][" + j + "].");
                }
            }
        }

    }

    private static int sumInt(String[][] arr) {

        int result = 0;
        for (String[] str : arr) {
            for (String string : str) {
                result += Integer.parseInt(string);
            }
        }
        return result;
    }

    private static String sumStr(String[][] arr) throws MyArrayExceptions {

        checkSize(arr);
        checkInt(arr);
        return sumElementsArray + sumInt(arr);

    }

}
// Исправьте код, примените подходящие способы обработки исключений:

// public static void main(String[] args) {
//     InputStream inputStream;
//     try {
//             String[] strings = {"apple", "orange"};
//             String strings1 = strings[2];
//             test();
//             int a = 1 / 0;
//             inputStream = new FileInputStream("/broken_reference");
//     } catch (ArithmeticException e) {
//             e.printStackTrace();
//             System.out.println("На ноль делить нельзя");
//     }
//     catch (Throwable e) {
//             e.printStackTrace();
//     } catch (StackOverflowError error) {
//             System.out.println("Что-то сломалось");
//     } finally {
//             System.out.println("Я все равно выполнился");
//     }
//     System.out.println("Я жив!");
// }

// private static void test() throws IOException {
//     File file = new File("1");
//     file.createNewFile();
//     FileReader reader = new FileReader(file);
//     reader.read();
//     test();
// } 

package PracticalTask2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class PT4 {

    public static void main(String[] args) {
        InputStream inputStream = null;
        try {
            String[] strings = { "apple", "orange" };
            String strings1 = strings[1];
            System.out.println(strings1);
            test();
            int a = 1 / 0;
            System.out.println(a);
            inputStream = new FileInputStream("/broken_reference");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: выход за пределы массива");
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: на ноль делить нельзя");
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка: файл не найден");
        } catch (IOException e) {
            System.out.println("Ошибка: чтение из файла не удалось");
        } catch (StackOverflowError e) {
            System.out.println("Ошибка: что-то сломалось");
        } catch (Throwable e) {
            System.out.println("Неизвестная ошибка");
        } finally {
            System.out.println("Я все равно выполнился");
            closeStream(inputStream);
        }
        System.out.println("Я жив!");
    }

    private static void test() throws IOException {

        try {
            File file = new File("Exceptions/seminar1/example1");
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка: файл не существует");
        }
    }

    private static void closeStream(InputStream stream) {
        if (stream != null) {
            try {
                stream.close();
            } catch (IOException e) {
            }
        }
    }

}
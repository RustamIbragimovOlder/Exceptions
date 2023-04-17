// 1. Создайте класс исключения, который будет выбрасываться при делении на 0.
// Исключение должно отображать понятное для пользователя сообщение об ошибке.

// 2. Создайте класс исключений, которое будет возникать при обращении к
// пустому элементу в массиве ссылочного типа. Исключение должно
// отображать понятное для пользователя сообщение об ошибке.

// 3. Создайте класс исключения, которое будет возникать при попытке открыть несуществующий файл.
// Исключение должно отображать понятное для пользователя сообщение об ошибке.

package seminar3;

public class example3 {

    public static void main(String[] args) throws DivideByZeroEcxeption, ArrayNullElementEcxeption {
        
        try {
            dev(5, 0);
        } catch (DivideByZeroEcxeption e) {
            e.printStackTrace();
        }

        try {
            printArray();
        } catch (ArrayNullElementEcxeption e) {
            e.printStackTrace();
        }

    }

    // Деление на 0

    public static void dev(int a, int b) {

        isOperandIsNotValue(b);
        int c = a / b;
        System.out.println("результат = " + c);

    }

    public static void isOperandIsNotValue(int b) {

        if (b == 0) {
            throw new DivideByZeroEcxeption();
        }

    }

    public static class DivideByZeroEcxeption extends RuntimeException {
        
        public DivideByZeroEcxeption() {
            super("Ошибка: деление на 0");
        }

    }

    // Обращение к пустому элементу массива

    public static void printArray() {

        Integer[] array = { 1, 2, 3, null, 5 };
        ArrayNullElement(array);
        for (Integer i : array) {
            System.out.println(i);
        }

    }

    public static void ArrayNullElement(Integer[] array) {

        for (Integer i : array) {
            if (i == null) {
                throw new ArrayNullElementEcxeption();
            }
        }

    }

    public static class ArrayNullElementEcxeption extends RuntimeException {
        
        public ArrayNullElementEcxeption() {
            super("Ошибка: обращение к пустому элементу в массиве");
        }

    }

    // Окрытие несуществующего файла

    // не доделан!!!!



    public static class FileNotExistEcxeption extends Exception {
        
        public FileNotExistEcxeption() {
            super("Ошибка: попытка открыть несуществующий файл");
        }

    }

    
}

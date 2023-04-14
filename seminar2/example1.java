package seminar2;

// import java.util.InputMismatchException;
import java.util.Scanner;

public class example1 {

    // Исходный код
    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);
    //     int[] arr = new int[10];
    //     System.out.println("Укажите индекс элемента массива, в который хотите записать значение 1");
    //     int index = scanner.nextInt();
    //     try {
    //         arr[index] = 1;
    //     } catch (Exception e) {
    //         System.out.println("Указан индекс за пределам массива");
    //     }
    // }

    // Исправленный код
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int[] arr = new int[10];
            System.out.println("Укажите индекс элемента массива, в который хотите записать значение 1");
            int index = 0;
            if (!scanner.hasNextInt()) {
                throw new IllegalArgumentException("Ошибка ввода числа");
            }
            index = scanner.nextInt();
            if (index < 0 || index >= arr.length) {
                throw new ArrayIndexOutOfBoundsException("Указан индекс за пределам массива");
            }
            arr[index] = 1;

        } catch (IllegalArgumentException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Неизвестная ошибка");
            e.printStackTrace();
        } 
        
    }
    
}

// Дан следующий код, исправьте его там, где требуется

// public static void main(String[] args) throws Exception {
//     try {
//         int a = 90;
//         int b = 3;
//         System.out.println(a / b);
//         printSum(23, 234);
//         int[] abc = { 1, 2 };
//         abc[3] = 9;
//     } catch (Throwable ex) {
//         System.out.println("Что-то пошло не так...");
//     } catch (NullPointerException ex) {
//         System.out.println("Указатель не может указывать на null!");
//     } catch (IndexOutOfBoundsException ex) {
//         System.out.println("Массив выходит за пределы своего размера!");
//     }
//  }
//  public static void printSum(Integer a, Integer b) throws FileNotFoundException {
//     System.out.println(a + b);
//  }
 

package PracticalTask2;

public class PT3 {

    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (ArithmeticException ex) {
            System.out.println("Делить на 0 нельзя!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
    }

    public static void printSum(int a, int b) {
        System.out.println(a + b);
    }
    
}

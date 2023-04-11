// Пример исключений

package seminar1;

public class example {
    public static void main(String[] args) {
        foo();
    }

    private static void foo() {
        try {
            int a = 2;
            int b = 3;
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
    
}

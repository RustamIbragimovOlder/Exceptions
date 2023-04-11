package lection1;

public class example2 {

    public static void main(String[] args) {
        System.out.println(divide(10, 0));
    }
    
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new RuntimeException("Divide by zero not permited");
        }
        return a / b;
    }
}

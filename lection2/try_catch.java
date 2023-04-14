package lection2;

import java.util.Collections;

public class try_catch {

    public static void main(String[] args) {
        int number = 1;
        try {
            number = 10 / 5;
            // number = 10 / 0;
            String test = null;
            // System.out.println(test.length());
            Collections.emptyList().add(new Object());
        } catch (ArithmeticException e) {
            System.out.println("Operation divide by zero not supported");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        } catch (Exception e) {
            System.out.println("Exception");
        }
        System.out.println(number);
    }
    
}

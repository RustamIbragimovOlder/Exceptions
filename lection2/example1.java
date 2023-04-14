package lection2;

import java.util.Collections;
import java.util.List;

public class example1 {

    public static void main(String[] args) {

        // // Пример NullPointerException
        // String name = null;
        // System.out.println(name.length());

        // // Пример ClassCastException
        // Object object = new String("123");
        // File file = (File) object;
        // System.out.println(file);

        // // Пример NumberFormatException
        // String number = "123fq";
        // int result = Integer.parseInt(number);
        // System.out.println(result);

        // Пример UnsupportedOperationException
        List<Object> emptyList = Collections.emptyList(); // создаем пустой лист
        emptyList.add(new Object());


    }
}
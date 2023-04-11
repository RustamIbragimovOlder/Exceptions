package lection1;

import java.io.File;

public class Application{

    public static void main(String[] args) {
        System.out.println(getFileSize(new File("/Users/Рустам Ибрагимов/Desktop/GB TEMP/Задания.txt")));
        System.out.println(getFileSize(new File("123")));
        System.out.println(divide(10, 0));

        
    }

    public static int divide(int a1, int a2) {
        if (a2 == 0) {
            return -1;
        }
        return a1 / a2;
    }

    public static long getFileSize(File file) {
        if (!file.exists()) {
            return -1L;
        }
        return file.length();
    }
}

// Создайте метод doSomething(), который может быть источником одного из
// типов checked exceptions (тело самого метода прописывать не обязательно).
// Вызовите этот метод из main и обработайте в нем исключение, которое
// вызвал метод doSomething().

package seminar3;

import java.io.FileNotFoundException;

public class example1 {

    public static void main(String[] args) {

        try {
            doSomething();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static void doSomething() throws FileNotFoundException {

    }
    
}

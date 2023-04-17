// Создайте класс Счетчик, у которого есть метод add(),
// увеличивающий значение внутренней int переменной на 1.
// Сделайте так, чтобы с объектом такого типа можно было работать в блоке try-with-resources.
// Нужно бросить исключение, если работа с объектом типа счетчик была не в ресурсном try
// и/или ресурс остался открыт.
// Подумайте какой тип исключения подойдет лучше всего.

package seminar3;

import java.io.IOException;

public class example2 {

    public static void main(String[] args) {
        
        try (Counter counter = new Counter()) {
            counter.add(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    public static class Counter implements AutoCloseable {
        
        @Override
        public void close() throws Exception {
            System.out.println("Counter closed");
        }

        public int add(int i) throws IOException {
            if (i == 1) {
                throw new IOException("Ошибка");
            }    
            i += 1; 
            return i;
        }
        
    }
    
}

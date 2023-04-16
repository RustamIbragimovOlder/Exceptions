// Создадим класс Box и скажем, что после работы коробка должна быть обязательно закрыта.

package lection3;

public class autoCloseable {
    
    // Неправильный код
    // public class Box {
    // }

    // public class MainApp {
    //     public static void main(String[] args) {
    //         try (Box box = new Box()) {
    //         } catch (Exception e) {
    //             e.printStackTrace();
    //         }
    //     }
    // }

    // Правильный код
    public class Box implements AutoCloseable {
        @Override
        public void close() throws Exception {
            // Закрываем коробку
        }
    }
    public class MainApp {
        public static void main(String[] args) {
            try (Box box = new Box()) {
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


}

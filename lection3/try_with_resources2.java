// Если в работе 2 файла (например: чтение файла и его перезапись в другой файл)

package lection3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class try_with_resources2 {

    public static void main(String[] args) {

        try (FileReader reader = new FileReader("/Users/Рустам Ибрагимов/repositories/Exceptions/.gitignore");
            FileWriter writer = new FileWriter("test")) {
            while (reader.ready()) {               // пока есть что считывать
                writer.write(reader.read());       // записать, все что считали
            }
        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception: " + e.getClass().getSimpleName());
        }

        System.out.println("Copy successfully");

    }

}

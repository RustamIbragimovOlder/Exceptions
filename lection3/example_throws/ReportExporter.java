// код «библиотеки» для формирования отчётов

package lection3.example_throws;

import java.io.IOException;
import java.io.PrintWriter;


// Исходный код
// public class ReportExporter {

//     public void saveReportToFile(String path, String data) {
//         String modifiedOutputData = data; // Представим, что здесь форматируются входные данные
//         try (PrintWriter writer = new PrintWriter(path)) {
//             writer.println(modifiedOutputData);
//         } catch (IOException e) {
//             // Просто погасили исключение
//         }
//     }
// }

// Исправленный код
public class ReportExporter {
    public void saveReportToFile(String path, String data) throws IOException {
        String modifiedOutputData = data; // Представим, что здесь форматируются входные данные
        try (PrintWriter writer = new PrintWriter(path)) {
            writer.println(modifiedOutputData);
        }
    }
}


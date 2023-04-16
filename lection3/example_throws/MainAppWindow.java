// Есть приложение с графическим интерфейсом, которое формирует отчёты
// и складывает их в некое файловое хранилище.
// Код по сохранению отчёта по нажатию на кнопку Save выглядит так:


// Исходный код
// package lection3.example_throws;

// import javax.swing.*;

// public class MainAppWindow extends JFrame {

//     private ReportExporter reportExporter = new ReportExporter();

//     public void onSaveReportButtonClick() {
//         String path = generateOutputReportPath();
//         String outputData = "Очень важные данные для отчета";
//         reportExporter.saveReportToFile(path, outputData);
//     }

//     public String generateOutputReportPath() {
//         return "D:/reports/repository/1/" +

//                 (int) (Math.random() * 10000000) + ".txt";
//     }
//     // ...

// }

// Исправленный код
package lection3.example_throws;

import java.io.IOException;

import javax.swing.*;

public class MainAppWindow extends JFrame {
    // ...
    public void onSaveReportButtonClick() {
        String path = generateOutputReportPath();
        String outputData = "Очень важные данные для отчета";
        ReportExporter reportExporter = new ReportExporter();
        try {
            reportExporter.saveReportToFile(path, outputData);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ошибка! Невозможно сохранить отчет", "Ошибка!", JOptionPane.ERROR_MESSAGE);
        }
    }
    // ...
}
    

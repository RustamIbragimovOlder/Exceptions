package lection3.custom_exception_types;

import java.util.Arrays;

// public class MainApp {

//     public static void main(String[] args) {
//         throw new MyException();
//         }
        
    
// }

// public class MainApp {
//     public static void main(String[] args) {
//     // ...
//         try {
//             CvImage img = cvLib.loadImage("C:/image.png");
//             cvLib.filters().blur(img, 2);
//         } catch (IllegalImageFormatException e) {
//             System.out.println("Выбрано изображение с неподдерживаемым форматом, выберите другой файл");
//         } catch (IllegalFilterParametersException e) {
//             System.out.println("Выбраны некорректные параметры фильтра");
//         } catch (JavaCVException e) {
//             System.out.println("Ой");
//         }
//     }
// }
    
public class MainApp {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(transform(new String[]{"1", "2", "3", "4"})));
    }
    public static int[] transform(String[] input) {
        int[] output = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            try {
                output[i] = Integer.parseInt(input[i]);
            } catch (NumberFormatException e) {
                throw new ArrayTransformationException(i, input[i]);
            }
        }
        return output;
    }
}
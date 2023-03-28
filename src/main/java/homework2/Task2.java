/**
 * Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
 * который запишет эту строку в простой текстовый файл, обработайте исключения.
 */

package homework2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) {
        String str = "TEST ";
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 101; i++) {
            sb.append(i+": ");
            sb.append(str);
        }
        System.out.println(sb);
        BufferedWriter output = null;
        try {
            File file = new File("C:\\Users\\user\\Desktop\\Мое обучение\\Git repositories\\Java_training\\src\\main\\resources\\files\\home2.txtt");
            output = new BufferedWriter(new FileWriter(file));
            output.write(sb.toString());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
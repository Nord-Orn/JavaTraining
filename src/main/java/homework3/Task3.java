/*
3. Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа.
 Пройти по списку, найти и удалить целые числа.
 */

package homework3;

import java.util.ArrayList;
import java.util.Arrays;


public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> oneList = new ArrayList<>(Arrays.asList("где", "36","изображено", "5", "объединение", "10", "двух", "41", "царств", "26", "в", "виде", "50", "переплетающихся", "99", "шеями", "львов"));
        System.out.println(oneList);
        for (int i = 0; i < oneList.size(); i++) {
            int n = 0;
            try {
                n = Integer.parseInt(oneList.get(i));
                oneList.remove(i);
            }
            catch (NumberFormatException e) {
            }
        }
    System.out.println(oneList);
    }
}

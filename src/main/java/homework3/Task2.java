/*
2. Задан целочисленный список ArrayList.
Найти минимальное, максимальное и среднее арифметическое из этого списка.
 */

package homework3;

import java.util.ArrayList;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> oneList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            oneList.add(random.nextInt(1, 41));
        }
        System.out.println(oneList);
        double sum = 0;
        int max = oneList.get(0);
        int min = oneList.get(0);
        for (int i: oneList) {
            sum += i;
            if (min > i) {
                min = i;
            } else if (max < i) {
                max = i;
            }
        }
        double sa = oneList.size() > 0 ? sum / oneList.size() : 0;
        System.out.println(sum);
        System.out.println("Max: " + max + " // Min: "  + min + " // Arithmetic mean: " + sa);
    }
}

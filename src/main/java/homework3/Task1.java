/*
1. Пусть дан произвольный список целых чисел, удалить из него четные числа
(в языке уже есть что-то готовое для этого)
 */

package homework3;

import java.util.ArrayList;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> oneList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            oneList.add(random.nextInt(1, 100));
        }
        System.out.println(oneList);
        oneList.removeIf(e -> (e % 2) == 0);;
        System.out.println("Odd Numbers: " + oneList);
    }
}

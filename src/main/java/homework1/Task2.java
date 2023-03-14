/**
 * 2. Дан массив nums = [3,2,2,3] и число val = 3.
 * Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
 * Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
 * а остальные - равны ему.
 */
package homework1;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 9, 3, 6, 7, 3, 6, 3};
        int i = 0;
        int j = arr.length - 1;
        int val = 3;
        System.out.println("Исходный массив: " + Arrays.toString(arr));
        while (i < j) {
            while (i < j && arr[j] == val) {
                j--;
            }
            if (arr[i] == val) {
                arr[i] = arr[j];
                arr[j] = val;
            }
            i++;
        }
        System.out.println("Полученный массив: " + Arrays.toString(arr));
    }
}

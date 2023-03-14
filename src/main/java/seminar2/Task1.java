/**
 * Дано число N > 0 и символы С1 и С2
 * Написать метод, который вернет строку длины N, которай состоит из чередующихся символов С1 и С2,
 * начиная с С1
 */


package seminar2;

public class Task1 {
    public static void main(String[] args) {
        int N = 21;
        String first = "A";    // char ввести не получилось, только String
        String second = "B";   // char ввести не получилось, только String
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                sb.append(first);
            } else {
                sb.append(second);
            }
        }
        System.out.println(sb);
    }
}

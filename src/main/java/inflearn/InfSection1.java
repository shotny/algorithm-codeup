package inflearn;

import java.util.Scanner;

public class InfSection1 {
    public static void test() {
        solution1();
    }
    public static void solution1() {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine().toUpperCase();
        char c = scanner.next().toUpperCase().charAt(0);
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == c) {
                count++;
            }
        }

        System.out.println(count);
    }
}

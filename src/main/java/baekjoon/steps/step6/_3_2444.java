package baekjoon.steps.step6;

import java.util.Scanner;

public class _3_2444 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int k = 0; k < (n - i); k++) {
                System.out.printf(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
        for (int i = (n-1); i >= 1; i--) {
            for (int k = 0; k < (n - i); k++) {
                System.out.printf(" ");
            }
            for (int j = (2 * i - 1); j >= 1; j--) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}

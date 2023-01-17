package baekjoon.steps.step8;

import java.util.Scanner;

public class _1_1978 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = n;

        for (int i = 1; i<=n; i++) {
            int number = scanner.nextInt();

            if (number == 1) {
                count -= 1;
            }

            for (int j = 2; j < number; j++) {
                if (number % j == 0) {
                    count -= 1;
                    break;
                }
            }
        }

        System.out.println(count);
    }
}

package baekjoon.steps.step2;

import java.util.Scanner;

public class _5_2884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();

        if (m >= 45) {
            System.out.printf("%d %d", h, m-45);
        } else {
            m = 60 + (m - 45);
            if (h == 0) {
                h = 24 -1;
                System.out.printf("%d %d", h, m);
            } else {
                h = h -1;
                System.out.printf("%d %d", h, m);
            }
        }
    }
}

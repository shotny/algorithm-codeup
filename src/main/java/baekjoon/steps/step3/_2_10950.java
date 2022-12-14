package baekjoon.steps.step3;

import java.util.Scanner;

public class _2_10950 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 1; i <= count; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a+b);
        }
        scanner.close();
    }
}

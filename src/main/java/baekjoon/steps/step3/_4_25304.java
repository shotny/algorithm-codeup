package baekjoon.steps.step3;

import java.util.Scanner;

public class _4_25304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalRect = scanner.nextInt();
        int totalTypes = scanner.nextInt();
//        int eachCost = scanner.nextInt();
//        int eachCount = scanner.nextInt();

        int reSum = 0;
        for (int i = 1; i <= totalTypes; i++) {
            reSum = reSum + scanner.nextInt()*scanner.nextInt();
        }
        scanner.close();

        if (reSum == totalRect) {
            System.out.println("Yes");
        } else System.out.println("No");
    }
}

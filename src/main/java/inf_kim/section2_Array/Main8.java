package inf_kim.section2_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] point = new int[n];

        for (int i = 0; i < n; i++) {
            point[i] = scanner.nextInt();
        }

        for (int i = 0; i < point.length; i++) {
            int grade = 1;
            for (int j = 0; j < point.length; j++) {
                if (j == i) { continue; }
                if (point[j] > point[i]) {
                    ++grade;
                }
            }
            System.out.printf("%d ", grade);
        }
    }
}

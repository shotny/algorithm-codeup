package baekjoon.steps.step5;

import java.util.Scanner;

public class _3_1065 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;

        if (n < 100) {
            count = n;
        }
        else {
            count = 99;
            if (n == 1000) {
                count--;
            }
            for (int i = 100; i <= n; i++) {
                int one = i % 10;
                int ten = (i / 10) % 10;
                int hund = i / 100;

                if (one - ten == ten - hund) {
                    count += 1;
                }
            }
        }
        System.out.println(count);

/*        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        if (n < 100) {
            System.out.println(n);
        } else {
            int count = 99;
            if (n == 1000) {
                count -= 1;
            }
            for (int i = 100; i <= n; i++) {
                int c = i % 10;
                int b = i / 10 % 10;
                int a = i / 100;

                if (a - b == b - c) {
                    ++count;
                }
            }
            System.out.println(count);
        }*/

        /*
        for (int i = 110; i <= n; i++) {
            boolean check = true;
            int gap = i%10 - (i/10)%10;

            while (i/100 != 0) {
                i = i/10;
                if ((i % 10 - (i / 10) % 10) != gap) {
                    check = false;
                    break;
                }
            }

            if (check == true) {
                count += 1;
            }
        }*/
    }
}


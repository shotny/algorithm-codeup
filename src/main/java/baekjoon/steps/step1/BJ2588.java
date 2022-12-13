package baekjoon.steps.step1;

import java.util.Scanner;

public class BJ2588 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String b = scanner.next();
        scanner.close();

        int c = a * (b.charAt(2) - '0');
        int d = a * Character.getNumericValue(b.charAt(1));
        int e = a * Character.getNumericValue(b.charAt(0));
        int result = c + d*10 + e*100;

        System.out.printf("%d\n%d\n%d\n%d",c,d,e,result);
    }
}

package baekjoon.steps.step8;

import java.util.Scanner;

public class _2_2581 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rangeStart = scanner.nextInt();
        int rangeEnd = scanner.nextInt();
        long sum = 0;
        int minimum = 0;

        for (int number = rangeStart; number <= rangeEnd; number++) {
            if (number == 2) {
                sum += number;
                minimum = number;
            }
            for (int divisor = 2; divisor < number; divisor++) {

                if (number % divisor == 0) {
                    break;
                } // 다른 약수가 존재하면 소수검증 더이상 필요없음

                if(divisor == number-1){
                    if (sum == 0) {
                        minimum = number;
                    }
                    sum += number;
                }
            }
        }

        if (sum == 0) {
            System.out.println("-1");
        }else System.out.printf("%d\n%d", sum, minimum);

    }
}

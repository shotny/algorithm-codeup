package baekjoon.steps.step8;

import java.util.Scanner;

public class _3_11653 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int q = n;

        // n을 i로 나눈다. i는 2부터 시작한다. 나머지가 0이될때까지 i의 값을 1씩 증가시킨다.
        // 나머지가 0이 되면 몫이 n에 할당된다.
        // n을 i로 나눈다. i는 2부터 시작한다. 나머지가 0이될때까지 i의 값을 1씩 증가시킨다.
        // n이 1이 될때까지 반복한다.

        for (int i = 2; q!=1; i++) {
            if (q % i == 0) {
                System.out.println(i);
                q = q / i;
                i = 1;

            }
        }
    }
}

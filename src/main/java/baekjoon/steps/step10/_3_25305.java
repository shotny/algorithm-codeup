package baekjoon.steps.step10;

import java.util.Scanner;

public class _3_25305 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];

        arr[0] = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            int now = scanner.nextInt();

            for (int j = 0; j < i; j++) {
                if (now > arr[j]) {
                    for (int q = i; q > j; q--) {
                        arr[q] = arr[q - 1];
                    }
                    arr[j] = now;
                    break;
                } else {arr[i] = now;}
            }
        }
        System.out.println(arr[k-1]);
    }
}

// 응시자의 수 N과 상을 받는 사람의 수 k가 공백을 사이에 두고 주어진다
// 점수 내림차순으로 정렬 후 k번째 점수 출력

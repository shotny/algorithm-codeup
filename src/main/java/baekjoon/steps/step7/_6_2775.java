package baekjoon.steps.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _6_2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= test; i++) {
            int k = Integer.parseInt(reader.readLine());
            int n = Integer.parseInt(reader.readLine());
            int[] underFloor = new int[n + 1];

            // 0층값으로 초기화
            for (int j = 1; j < underFloor.length; j++) {
                underFloor[j] = j;
            }

            for (int a = 1; a <= k; a++) { // 1층부터 k층까지 각 호에 몇명있는지 배열에 저장
                for (int b = 2; b <= n; b++) { // 각 호수마다
                    underFloor[1] = 1;
                    underFloor[b] = underFloor[b] + underFloor[b - 1];
                }
            }

            System.out.println(underFloor[n]);

            // 0층 부터 있음. 0층 n호에는 n명이 산다.
            // k층 n호 = ((k-1)층 n) + (k층 (n-1))
            // 2f | 1  4  10 20 35
            // 1f | 1  3  6  10 15
            // 0f | 1  2  3  4  5
        }
    }
}

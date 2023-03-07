package baekjoon.steps.step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 오름차순 정렬 문제
public class _1_2750 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] asc = new int[n];
        int now = 0;

        asc[0] = Integer.parseInt(reader.readLine());

        for (int i = 1; i < n; i++) {
            now = Integer.parseInt(reader.readLine());

            for (int j = 0; j < i; j++) {
                if (now < asc[j]) {
                    for (int k = i; k > j; k--) {
                        asc[k] = asc[k - 1];
                    }
                    asc[j] = now;
                    break;
                } else {
                    asc[i] = now;
                }
            }
        }
        reader.close();

        for (int i = 0; i < n; i++) {
            System.out.println(asc[i]);
        }
    }
}

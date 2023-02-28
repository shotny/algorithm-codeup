package baekjoon.steps.step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 자연수 p와 약수 q
public class _2_2501 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int n = Integer.parseInt(s.split(" ")[0]);  // n의 약수 중
        int k = Integer.parseInt(s.split(" ")[1]);  // k번 째로 작은
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                ++count;
                if (count == k) {
                    System.out.println(i);
                    break;
                }
            }
        }

        if (count < k) {
            System.out.println(0);
        }
    }
}

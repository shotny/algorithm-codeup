package baekjoon.steps.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _3_1193 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // 첫 번째 칸에 하나, 두 번째에 두 개, 세 번째에 세개
        int n = Integer.parseInt(reader.readLine());
        int count = 1; // 첫 번째 칸 1/1에서
        int sum = 1;

        while (sum < n) {
            count++;
            sum += count;
        }
        int gap = sum - n;

        if (count % 2 == 0) {
            System.out.printf("%d/%d", count-gap, 1+gap);
        } else {
            System.out.printf("%d/%d", 1+gap, count-gap);
        }
    }
}

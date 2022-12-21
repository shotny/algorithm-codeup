package baekjoon.steps.step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _7_2908 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int result = 0;

        if (a % 10 != b % 10) {
            result = a % 10 > b % 10 ? a : b;
        } else {
            if ((a/10)%10 != (b/10)%10) {
                result = (a/10)%10 > (b/10)%10 ? a : b;
            } else {
                result = a/100 > b/100 ? a: b;
            }
        }

        System.out.printf("%d%d%d", result%10, result/10%10, result/100);
    }
}

package baekjoon.steps.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _5_10250 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(reader.readLine());

        // n을 h로 나눈 -> 몫+1 = 호수 __n, 나머지+1 = 층수 n__(나머지가 0일 경우 층수는 h)
        // 나머지(호수)가 10 미만이면 앞에 0 붙여야함

        for (int i = 1; i <= test; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
            int h = Integer.parseInt(st.nextToken());
            st.nextToken();
            int n = Integer.parseInt(st.nextToken());

            int floor = n % h;
            int ground = n / h;
            if (floor != 0) {
                System.out.println( (floor * 100) + (ground + 1));
            } else {
                System.out.println( h*100 + ground);
            }
        }
    }
}

package baekjoon.steps.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _1_1712 {
    public static void main(String[] args) throws IOException {
        // 고정비용, 생산비용, 판매가격, 판매개수-손익분기점 21억 미만 자연수
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int fixed = Integer.parseInt(st.nextToken());
        int production = Integer.parseInt(st.nextToken());
        int price = Integer.parseInt(st.nextToken());
        long count = 0L;

        /*  시간초과
        Scanner scanner = new Scanner(System.in);
        int fixed = scanner.nextInt();
        int production = scanner.nextInt();
        int price = scanner.nextInt();
        long count = 0;
        */

        if (production >= price) {
            System.out.println(-1);
        } else {
            while (price*count <= fixed + production*count) {
                count++;
            }
            System.out.println(count);
        }

        // 훨씬 더 빠른 방법:
        // price*count = fixed + production*count
        // 위의 식이 손과 익이 만나는 지점-> 여기서 +1한게 손익분기점: count
        // fixed = (price-production)count
        // fixed / (price-production) = count 에 +1
    }
}

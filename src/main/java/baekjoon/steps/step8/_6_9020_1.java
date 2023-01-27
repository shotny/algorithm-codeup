package baekjoon.steps.step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class _6_9020_1 {
    //골드바흐 수: 2보다 큰 모든 짝수는 두 소수의 합으로 나타낼 수 있다. 짝수를 두 소수의 합으로 나타내는 표현을 그 수의 골드바흐 파티션
    //n의 골드바흐 파티션을 출력. 여러 가지인 경우에는 두 소수의 차이가 가장 작은 것을 출력
    // 1. n 범위 안의 소수 찾기
    // 2. n/2 가 소수인지 확인(소수라면 해당 소수가 파티션)
    // 3. <반복> n/2 보다 작은 수 중 가장 큰 소수 = left, (n-x)가 소수일 경우 x와 (n-x)가 골드바흐 파티션
    // 4. x와 (n-x)가 아닐 경우 'x바로 아래 소수'와 '해당 수를 n에서 뺸 결과'를 더하면 n이 되는지 보고 안되면 그 아래 소수로 반복

    public static void main(String[] args)throws IOException {
               BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= testCase; i++) {
            int n = Integer.parseInt(reader.readLine());
            getPartition(n);
        }
    }


    // n보다 작은 소수들 배열로 정리하기
    private static ArrayList<Integer> getPrimes(int n) {
        ArrayList<Integer> primes = new ArrayList<>();
        boolean[] range = new boolean[n+1]; // 소수면 false, 아니면 true

        for (int i = 2; i * i <= n; i++) {
            if(!range[i]){
                for (int j = 2; i * j < range.length; j++) {
                    range[i * j] = true;
                }
            }
        }

        for (int i = 2; i < range.length; i++) {
            if (!range[i]) {
                primes.add(i);
            }
        }

        return primes;
    }

    // n의 골드바흐 파티션 찾기
    private static void getPartition(int n) {
        ArrayList<Integer> primes = getPrimes(n);

        if (primes.contains(n / 2)) {
            System.out.printf("%d %d\n", n / 2, n / 2);
        } else {
            // 파티션 찾을 때까지 반복 -> 소수 x와 (n-x)가 소수인지

            // n/2 바로 아래 소수로 x 값 초기화 후 y를 n-2로 초기화
            int x = n/2;
            for (int i = 1; !primes.contains(x); i++) {
                x -= i;
            }
            int y = n - x;

            while (!primes.contains(y)) {
                int xIndex = primes.indexOf(x);
                x = primes.get(xIndex - 1);
                y = n - x;
            }

            System.out.printf("%d %d\n", x, y);
        }
    }
}

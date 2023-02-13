package baekjoon.steps.step8;

import java.io.*;

public class _6_9020_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer   = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(reader.readLine());

        getPrimeArr();

        for (int i = 1; i <= testCase; i++) {
            int n = Integer.parseInt(reader.readLine());
            int x = getPartition(n);
            writer.write(String.valueOf(x + " " + (n-x) + "\n"));
            writer.flush();
        }
        reader.close();
        writer.close();
    }

    private static boolean[] primeArr = new boolean[10001];
    private static boolean[] getPrimeArr() {
        for (int i = 2; i < primeArr.length; i++) {
            primeArr[i] = true;
        }

        for (int i = 2; i < primeArr.length; i++) {
            if(primeArr[i] != false){

                for (int j = 2; i * j < primeArr.length; j++) {
                    primeArr[i*j] = false;
                }
            }
        }
        return primeArr;
    }

    private static int getPartition(int n) {
        int x = n / 2;
        if (primeArr[x] == true) {
        } else {
            while (!(primeArr[x] == true && primeArr[n - x] == true)) {
                x -= 1;
            }
        }
        return x;
    }
}

// 짝수를 두 소수의 합으로 나타내는 표현을 그 수의 골드바흐 파티션이라고 한다.
// 2보다 큰 짝수 n이 주어졌을 때, n의 골드바흐 파티션을 출력하는 프로그램을 작성
// 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고 짝수 n이 주어진다.

/* 골드바흐 파티션 찾기
        1. 주어진 수를 n이라 할 때, n의 범위는 4 ≤ n ≤ 10,000
        2. '2 ≤ 소수의 배열 ≤ 5,000' 소수 배열을 생성한다.
        3. n/2가 소수인가?
           YES: n/2가 골드바흐 파티션이다. | NO-> 4.
        4. 소수 배열을 이용해 n/2 보다 작은 소수 중 가장 큰 값부터 x에 할당하고
           n-x가 소수면 x와 n-x가 골드바흐 파티션이다.
*/

package baekjoon.steps.step8;

import java.io.*;

public class _6_9020 {
    public static boolean[] isPrimeNumber = new boolean[10001];

    public static void main(String[] args) throws IOException {
        BufferedReader reader   = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer   = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(reader.readLine());

        createFunc();//에라토스테네스의 체 create 함수

        for (int i = 1; i <= testCase; i++) {
            int n = Integer.parseInt(reader.readLine());
            int x = getPartition(n);
            writer.write(String.valueOf(x + " " + (n-x) + "\n"));
        }

        reader.close();
        writer.flush();
        writer.close();

        return;
    }

    private static int getPartition(int n) {
        if (isPrimeNumber[n/2] == false) {
            return n/2;
        } else {
            // 파티션 찾을 때까지 반복 -> 소수 x와 (n-x)가 소수인지

            // n/2 바로 아래 소수로 x 값 초기화 후 y를 n-2로 초기화
            int x = n/2;
            for (int i = 1; isPrimeNumber[x]; i++) {
                x -= 1;
            }
            int y = n - x;
            while (isPrimeNumber[y]){
                x = x - 1;
                y = n - x;
            }
            return x;
        }
    }

    private static void createFunc() {
        isPrimeNumber[0] = isPrimeNumber[1] = true;
        for (int i = 2; i * i <= 10000; i++) {
            if(!isPrimeNumber[i]){
                for (int j = 2; i * j < isPrimeNumber.length; j++) {
                    isPrimeNumber[i * j] = true;
                }
            }
        }
    }
}

package baekjoon.steps.step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5_4948 {
    // 자연수 n에 대하여, n보다 크고, 2n보다 작거나 같은 소수 구하기

    public static boolean lastNumber;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (!lastNumber) {
            int n = Integer.parseInt(reader.readLine());
            if (!lastCheck(n)) {
                System.out.println(getPrimeCount(n));
            }
        }

    }
    public static boolean lastCheck(int n) {
        if (n == 0) {
            lastNumber = true;
        }
        return lastNumber;
    }

    // n 보다 크고 2n 보다 작은 소수 개수 찾기
    public static int getPrimeCount(int n) {
        int primeNumCount = 0;
        boolean[] primeArr = new boolean[(2 * n) + 1];

        for (int i = 2; i * i <= 2 * n; i++) {
            if (primeArr[i] == false) {
                for (int j = 2; i * j < primeArr.length; j++) {
                    primeArr[i * j] = true;
                }
            }
        }

        for (int i = n + 1; i < primeArr.length; i++) {
            if (primeArr[i] == false) {
                primeNumCount++;
            }
        }

        return primeNumCount;
    }
}

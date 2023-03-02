package baekjoon.steps.step8;

import java.io.*;

public class _3_9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());

        while (n != -1) {
            writer.write(isPerfect(n));
            n = Integer.parseInt(reader.readLine());
        }

        reader.close();
        writer.flush();
        writer.close();
    }

    private static String isPerfect(int n) {

        if (n == 1) {
            return "1 = 1";
        }

        int sum = 0;
        int[] factors = getFactor(n);
        String print = n + " = 1";

        for (int i = 1; i < n; i++) {
            if (factors[i] == 1) {
                sum += i;
                if (i != 1) {
                    print = print + " + " + i;
                }
            }
        }

        if (sum == n) {
            return print + "\n";
        } else {
            return n + " is NOT perfect.\n";
        }
    }

    private static int[] getFactor(int n) {
        int[] factors = new int[n+1];
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[i] = 1;
            }
        }
        return factors;
    }
}

/* n이 완전수인지 아닌지 판단.(숫자 n이 자신을 제외한 모든 약수들의 합과 같으면, 그 수를 완전수라고 한다.)
* n이 -1이 아닐 때까지 값 입력 받기
* n의 약수 구하기
* n이 완전수인지 확인하기
* n이 완전수이거나 아닐때 다르게 출력하기
* */

package baekjoon.steps.step8;

import java.io.*;
import java.util.StringTokenizer;

public class _4_1929 {

    public static boolean[] primeNum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int startNum = Integer.parseInt(st.nextToken());
        int endNum = Integer.parseInt(st.nextToken());

        primeNum = new boolean[endNum+1];
        getPrimeNum();

        StringBuilder sb = new StringBuilder();
        for(int i = startNum; i <= endNum; i++) {
            if(!primeNum[i]) {
                sb.append(i + "\n");
            }
        }

        System.out.println(sb.toString());

        br.close();
    }

    // 에라토스테네스의 체
    public static void getPrimeNum() {
        primeNum[1] = true;

        for (int i = 2; i < primeNum.length; i++) {
            for (int j = 2; i * j < primeNum.length; j++) {
                primeNum[i * j] = true;
            }
        }
    }


        /*int size = n - m + 1;
        boolean[] arr = new boolean[size];

        for (int j = 2; j <= n; j++) {
            for (int i = m; i <= n++; i++) {
                if (arr[i - m] == false) {
                    if (i % j == 0) {
                        arr[i - m] = true;
                    }
                }
            }
        }

        for (int i = 0; i < size; i++) {
            if (arr[i] == true) {
                writer.write(i + "\n");
                writer.flush();
            }
        }*/

        /*for (int i = m; i <= n; i++) {
            for (int j = 2; j <= i; j++) {
                if (i != j && i % j == 0) {
                    break;
                } else if (i == j && i % j == 0) {
                    writer.write(i+"\n");
                    writer.flush();
                }
            }
        }*/

}

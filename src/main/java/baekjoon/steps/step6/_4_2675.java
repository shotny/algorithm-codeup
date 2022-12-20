package baekjoon.steps.step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _4_2675 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= testCase; i++) {
            String s = reader.readLine();

            int n = Integer.parseInt(s.split(" ")[0]);  // 몇번 반복할지 결정
            String[] word = s.split(" ")[1].split("");

            for (int j = 0; j < word.length; j++) { // 주어진 문자 순회하면서 출력
                for (int k = 1; k <= n; k++) { // 주어진 횟수만큼 반복출력
                    System.out.print(word[j]);
                }
            }
            System.out.println();
        }

    }
}

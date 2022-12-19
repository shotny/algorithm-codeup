package baekjoon.steps.step4;

import java.io.*;

public class _8_8958 {
    // 문제 맞춘 경우: ++score; 후 result += score;
    // 문제 틀린 경우: score = 0; 후 result += score;
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= n; i++) {
            String[] oxlist = reader.readLine().split("");
            int score = 0;
            int result = 0;

            for (int j = 0; j < oxlist.length; j++) {
                if (oxlist[j].equals("O")) {
                    score +=1;
                } else {
                    score = 0;
                }
                result += score;
            }
            System.out.println(result);
        }
    }
}

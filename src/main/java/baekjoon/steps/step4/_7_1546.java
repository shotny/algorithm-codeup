package baekjoon.steps.step4;

import java.io.*;

public class _7_1546 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // 최대값 구하고 해당 인덱스 체크 ..1
        // 해당 인덱스 제외하고 배열 돌면서 새로운 값 계산 ..2

        int n = Integer.parseInt(reader.readLine());
        String[] score = reader.readLine().split(" ");

        float sum = 0;
        int max = Integer.parseInt(score[0]);
        int maxIndex = 0;

        for (int i = 1; i < score.length; i++) {
            if (Integer.parseInt(score[i]) > max) {
                max = Integer.parseInt(score[i]);
                maxIndex = i;
            }
        } // ..1

        for (int i = 0; i < score.length; i++) {
            float newScore = Integer.parseInt(score[i]) / (float)max * 100;
            sum += newScore;
        } // ..2

        System.out.printf("%.2f", sum/n);
    }
}

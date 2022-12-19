package baekjoon.steps.step4;

import java.io.*;

public class _9_4344 {
    //각 줄마다 ..for1 반 평균 구하기 ..for2 반평균 넘는 학생 수 구하기
    //평균 넘는 학생 비율 계산해 출력
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= n; i++) {
            String[] score = reader.readLine().split(" ");
            int students = Integer.parseInt(score[0]);
            int sum = 0;
            float count = 0;

            for (int j = 1; j < score.length; j++) {
                sum += Integer.parseInt(score[j]);
            }
            int average = sum / students;

            for (int j = 1; j < score.length; j++) {
                if (Integer.parseInt(score[j]) > average) {
                    ++count;
                }
            }
            System.out.printf("%.3f%%\n", count / students * 100);
        }
    }
}

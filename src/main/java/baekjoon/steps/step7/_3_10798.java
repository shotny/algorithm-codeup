package baekjoon.steps.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _3_10798 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[][] board = new String[5][15];
        StringBuilder total = new StringBuilder();
        int max = 0;

        for (int i = 0; i < 5; i++) {
            String line = reader.readLine();
            String[] splitLine = line.split("");
            if (line.length() > max) {
                max = line.length();
            }

            for (int j = 0; j < line.length(); j++) {
                board[i][j] = splitLine[j];
            }
        }

        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 5; j++) {
                if (board[j][i] != null) {
                    total.append(board[j][i]);
                }
            }
        }

        System.out.println(total);
    }
}

// Q) 다섯 개의 단어 만듦 -> 세로로 글자 읽는데 없으면 있는거만 읽음
// 한 줄씩 입력 받아서 사이즈 체크 후 배열에 할당
// 배열1부터 5까지 돌아가면서 n번째 요소에 값있으면 (String)total에 합치기

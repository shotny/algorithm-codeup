package baekjoon.steps.step4;

import java.io.*;

public class _5_5597 {
    public static void main(String[] args)throws IOException {
        /*
        * 길이가 30인 배열 생성
        * 입력은 28번 받음, 리스트의 (입력받은 인덱스 - 1)에 입력받은 수 넣기
        * 리스트 요소 중, 값이 null인 요소 찾기
        * 0을 제외한 두 인덱스에 각 +1해 적은 수부터 출력
        *  */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] list = new int[31];

        for (int i = 1; i <= 28; i++) {
            int num = Integer.parseInt(reader.readLine());
            list[num] = 1;
        }

        for (int i = 1; i <= 30; i++) {
            if (list[i] != 1) {
                writer.write(i+"\n");
            }
        }
        reader.close();
        writer.flush();
        writer.close();
    }
}

package baekjoon.steps.step4;

import java.io.*;

public class _6_3052 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int[] remainders = new int[10];

        for (int i = 0; i < 10; i++) {
            remainders[i] = Integer.parseInt(reader.readLine()) % 42;
        }

        // 서로 다른 값 어껗게 체크하냐고오오.. 중복이 아니면 카운트를 하나 올리면 됐다..
        for (int i = 0; i < remainders.length; i++) {
            int check = 0;
            for (int j = i + 1; j < remainders.length; j++) {
                if (remainders[i] == remainders[j]) {
                    ++check;
                }
            }
            if (check == 0) {
                ++count;
            }
        }
        System.out.println(count);
    }
}

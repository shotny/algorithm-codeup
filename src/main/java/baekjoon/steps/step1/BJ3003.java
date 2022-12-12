package baekjoon.steps.step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ3003 {
    // total 16 - 킹 1, 퀸 1, 룩 2, 비숍 2, 나이트 2, 폰 8
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] white = reader.readLine().split(" ");
        String[] needs = new String[6];

        for (int i = 0; i < white.length; i++) {
            int now = Integer.parseInt(white[i]);
            int result = 0;
            if (i <= 1) {
                result = 1 - now;
                needs[i] = String.valueOf(result);
            } else if (i <= 4) {
                result = 2 - now;
                needs[i] = String.valueOf(result);
            } else {
                result = 8 - now;
                needs[i] = String.valueOf(result);
            }
        }

        for (String piece : needs) {
            System.out.printf("%s ",piece);
        }
    }
}

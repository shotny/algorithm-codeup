package baekjoon.steps.step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _6_1152 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = reader.readLine().split(" ");
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            if (!s[i].equals("")) {
                count++;
            }
        }

        System.out.println(count);
    }
}

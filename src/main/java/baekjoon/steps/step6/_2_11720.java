package baekjoon.steps.step6;

import java.io.*;

public class _2_11720 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String s = reader.readLine();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(s.split("")[i]);
        }
        System.out.println(sum);
    }
}

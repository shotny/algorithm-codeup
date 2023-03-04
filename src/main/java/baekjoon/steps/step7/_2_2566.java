package baekjoon.steps.step7;

import java.io.*;
import java.util.StringTokenizer;

public class _2_2566 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int row=0;
        int column=0;
        int max = 0;

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
//            String iLine = reader.readLine();
            for (int j = 0; j < 9; j++) {
//                int num = Integer.parseInt(iLine.split(" ")[j]);
                int num = Integer.parseInt(st.nextToken());
                if (num > max) {
                    max = num;
                    row = i;
                    column = j;
                }
            }
        }
        System.out.printf("%d\n%d %d", max, row+1, column+1);
    }
}

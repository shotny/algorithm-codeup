package baekjoon.steps.step7;

import java.io.*;

public class _1_2738 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String size = reader.readLine();
        int n = Integer.parseInt(size.split(" ")[0]);
        int m = Integer.parseInt(size.split(" ")[1]);

        int[][] a = new int[n][m];
        int[][] b = new int[n][m];
        int[][] sum = new int[n][m];

        // 행렬 A
        for (int i = 0; i < n; i++) {
            String line = reader.readLine();
            for (int j = 0; j < m; j++) {
                a[i][j] = Integer.parseInt(line.split(" ")[j]);
            }
        }

        // 행렬 B
        for (int i = 0; i < n; i++) {
            String line = reader.readLine();
            for (int j = 0; j < m; j++) {
                b[i][j] = Integer.parseInt(line.split(" ")[j]);
            }
        }
        reader.close();

        //행렬 더하기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum[i][j] = a[i][j] + b[i][j];
                writer.write(String.valueOf(sum[i][j]) + " ");
            }
            writer.write("\n");
        }
        writer.flush();
        writer.close();
    }
}

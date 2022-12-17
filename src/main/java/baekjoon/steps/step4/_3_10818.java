package baekjoon.steps.step4;

import java.io.*;
import java.util.StringTokenizer;

public class _3_10818 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(st.nextToken());
        String[] list = reader.readLine().split(" ");
        int min = Integer.parseInt(list[0]);
        int max = Integer.parseInt(list[0]);

        for (int i = 0; i < list.length; i++) {
            if (Integer.parseInt(list[i]) < min) {
                min = Integer.parseInt(list[i]);
            } else if (Integer.parseInt(list[i]) > max) {
                max = Integer.parseInt(list[i]);
            }
        }
        reader.close();
        writer.write(min + " " + max);
        writer.flush();
        writer.close();
    }
}

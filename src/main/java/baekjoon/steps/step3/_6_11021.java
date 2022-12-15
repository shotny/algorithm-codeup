package baekjoon.steps.step3;

import java.io.*;
import java.util.StringTokenizer;

public class _6_11021 {
    public static void main(String[] args)throws IOException {
        // 	16144kb	172ms
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(reader.readLine());
            int result = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
            writer.write("Case #"+i+": "+result+"\n");
        }
        reader.close();
        writer.flush();

        /* 16184kb	156ms
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= n; i++) {
            String string = reader.readLine();
            int a = Integer.parseInt(string.split(" ")[0]);
            int b = Integer.parseInt(string.split(" ")[1]);

            writer.write("Case #"+i+": "+(a+b)+"\n");
        }
        reader.close();
        writer.flush();
        */
    }
}

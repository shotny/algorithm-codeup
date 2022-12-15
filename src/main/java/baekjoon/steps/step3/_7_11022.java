package baekjoon.steps.step3;

import java.io.*;
import java.util.StringTokenizer;

public class _7_11022 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        StringTokenizer st;

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(reader.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int result = a + b;
            writer.write("Case #"+i+": "+a+" + "+b+" = "+result+"\n");
        }
        reader.close();
        writer.flush();
    }
}

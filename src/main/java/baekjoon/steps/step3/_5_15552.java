package baekjoon.steps.step3;

import java.io.*;

public class _5_15552 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            String string = reader.readLine();
            int a = Integer.parseInt(string.split(" ")[0]);
            int b = Integer.parseInt(string.split(" ")[1]);
            writer.write(a+b+"\n");
        }
        reader.close();
        writer.flush();
    }
}

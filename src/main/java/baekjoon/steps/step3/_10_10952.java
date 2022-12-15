package baekjoon.steps.step3;

import java.io.*;
import java.util.StringTokenizer;

public class _10_10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        while (true) {
//            String string = reader.readLine();
//            int a = Integer.parseInt(string.split(" ")[0]);
//            int b = Integer.parseInt(string.split(" ")[1]);

            st = new StringTokenizer(reader.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0) {
                reader.close();
                break;
            } else
                System.out.println(a + b);
        }

    }
}

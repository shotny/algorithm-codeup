package baekjoon.steps.step4;

import java.io.*;

public class _1_10807 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String num = reader.readLine();
        String[] list = reader.readLine().split(" ");
        String check = reader.readLine();
        int count = 0;

        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(check)) {
                ++count;
            }
        }
        writer.write(Integer.toString(count));
        reader.close();
        writer.flush();
        writer.close();
    }
}

package baekjoon.steps.step4;

import java.io.*;

public class _4_2562 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int max = Integer.parseInt(reader.readLine()); // 처음 입력된 수
        int index =1;

        for (int i = 2; i <= 9; i++) {
            int now = Integer.parseInt(reader.readLine());

            if (now > max) {
                max = now;
                index = i;
            }
        }

        reader.close();
        writer.write(max+"\n"+index);
        writer.flush();
        writer.close();
    }
}

package baekjoon.steps.step3;

import java.io.*;

public class _12_1110 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        int check = n;
        int count = 0;

        do {
            n = (n % 10) * 10 + (n / 10 + n % 10) % 10;
            ++count;
        } while (n != check);
        writer.write(Integer.toString(count));

        reader.close();
        writer.flush();
        writer.close();
    }
}

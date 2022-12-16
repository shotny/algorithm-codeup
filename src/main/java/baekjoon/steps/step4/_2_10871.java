package baekjoon.steps.step4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class _2_10871 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(st.nextToken());
        int max = Integer.parseInt(st.nextToken());
        String[] list = reader.readLine().split(" ");
        List lowerList = new ArrayList();

        for (int i = 0; i < list.length; i++) {
            if (Integer.parseInt(list[i]) < max) {
                lowerList.add(list[i]);
            }
        }

        for (int i = 0; i < lowerList.size(); i++) {
            writer.write(lowerList.get(i) + " ");
        }

        reader.close();
        writer.flush();
        writer.close();
    }
}

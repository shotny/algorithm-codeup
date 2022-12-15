package baekjoon.steps.step3;

import java.io.*;
import java.util.Scanner;

public class _8_2438 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());

        int count = 0;

        loop:
        for (int i = 1; i <= n; i++) {
            while (true) {
                System.out.print("*");
                count++;
                if (count == i) {
                    count = 0;
                    System.out.println();
                    continue loop;
                }
            }
        }
        reader.close();
        writer.flush();

        /*
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;

        loop:
        for (int i = 1; i <= n; i++) {
            while (true) {
                System.out.print("*");
                count++;
                if (count == i) {
                    count = 0;
                    System.out.println();
                    continue loop;
                }
            }
        }
        */
    }
}

package baekjoon.steps.step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ18108 {
    // 불기연도 -> 서기연도로 변경  _ 불기= 서기+544
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int buddha = Integer.parseInt(reader.readLine());
        System.out.println(buddha-543);
    }
}

package baekjoon.steps.step3;

import java.io.*;
import java.util.StringTokenizer;

public class _11_10951 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String st;
        while ((st = reader.readLine()) != null) {
            System.out.println(Integer.parseInt(st.split(" ")[0]) + Integer.parseInt(st.split(" ")[1]));
        } //while

        /* 런타임 에러 (NullPointer)
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String st = reader.readLine();
            if (st=="") {   // st=="" 를 st == null 로 변경해주면 됨.
                reader.close();
                break;
            } else{
                System.out.println(Integer.parseInt(st.split(" ")[0]) + Integer.parseInt(st.split(" ")[1]));
            }
        }*/
    }
}

package baekjoon.steps.step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ1008 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        System.out.println((double) Integer.parseInt(st.nextToken()) / Integer.parseInt(st.nextToken()));
    }

    /*
    출력값의 절대오차 또는 상대오차가 10^(-9) 이하이면 정답
    . 원래 답과의 차이가 +-10%까지 허용: 상대 오차는 10^-1까지 허용한다는 의미'
    . +-1% 차이는 상대오차 10^(-2)까지 허용한다는 의미
    */
}

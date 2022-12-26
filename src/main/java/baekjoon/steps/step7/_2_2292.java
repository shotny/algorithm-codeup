package baekjoon.steps.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2_2292 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // 육각형 벌집은 1을 중심으로 겹겹이 붙어있다고 볼 수 있다.
        // 한 단계마다 숫자의 범위다 나눠져있고, 해당 범위의 숫자까지 도달하기 위해선 해당 단계만큼 거치면 된다.
        // 예. 3단계의 범위는 8~19이고, 1에서 해당 범위의 방까지 도달하기 위해서는 세 번만 거치면된다.
        // n번 방까지 도달하기 위해선 n번 방이 몇 단계의 범위에 속하는지 알면 된다.
        // 각 단계(x)의 최대 범위는 이전 최대값(1부터 시작) + 6*(x-1) 이다.
        // 1 부터 시작해 n이 범위 최대값보다 크면 위의 식을 진행하며 카운트를 센다. 범위의 최대값이 n보다 커질 때 카운트가 정답이된다.

        int n = Integer.parseInt(reader.readLine());
        int count = 1; // 단계 체크
        int rangeMax = 1;

        while (n > rangeMax) {
            rangeMax += 6 * count;
            count++;
            // count 단계에서 시작하는데 while문이 실행된다면 n이 count 단계의 최대값보다 큰것.
            // count+1 단계의 최대값을 구해야하기 때문에 <rangeMax += 6*count> 로 먼저 범위최대값 구한 후
            // 해당 단계값 구함(count++)
        }
        System.out.println(count);
    }
}

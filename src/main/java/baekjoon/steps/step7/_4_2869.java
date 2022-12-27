package baekjoon.steps.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _4_2869 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int plus = Integer.parseInt(st.nextToken());
        int minus = Integer.parseInt(st.nextToken());
        int goal = Integer.parseInt(st.nextToken());


        // 그냥 day 계산 = goal/(plus - minus) 하고 나머지가 0 아니면 +1
        // 정상에 도착하면 안 미끄러질 때 계산-> (낮 기준 goal-minus)/(plus-minus) 나머지가 0 아니면 +1

        int day = (goal - minus) / (plus - minus);
        if ((goal - minus) % (plus - minus) != 0) {
            day++;
        }
        System.out.println(day);

        /* 1.. 시간초과
        int day =0;
        int height = 0;

        while (height < goal) {
            day++;
            height += plus;
//            System.out.println("height = " + height + " / day = " + day);
            if (height >= goal) {
                break;
            }
            height -= minus;
        }
        System.out.println(day);*/


        /* 2.. 오답
        if (plus - minus == 1) {
            System.out.println(goal/(plus-minus) - minus);
        } else if (goal / (float) (plus - minus) % 10 != 0) {
            System.out.println(goal/(plus-minus) + 1);
        } else System.out.println(goal/(plus-minus));*/

        // 2,1,5 가 주어질 경우
        // 0+2=2, -1= 1, ++1 / 1+2=3, -1=2, ++2 / 2+2=4, -1 = 3 ++3/3+2=도착 ++"4일차"
    }
}

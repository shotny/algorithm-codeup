package baekjoon.steps.step2;

import java.util.Date;
import java.util.Scanner;

public class _7_2480 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, b, c;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        // 만약 모든 변수가 다른 경우
        if (a != b && b != c && a != c) {
            int max;
            // 만약 a > b 라면
            if (a > b) {
                // c > a > b 라면
                if (c > a) {
                    max = c;
                }
                // a > (b, c)
                else {
                    max = a;
                }
            }
            // b > a 라면
            else {
                // c > b > a 라면
                if (c > b) {
                    max = c;
                }
                // b > (a, c)
                else {
                    max = b;
                }
            }
            System.out.println(max * 100);
        }
        // 적어도 한 쌍 이상의 서로 같은 변수가 존재할 경우
        else {
            // 3개의 변수가 모두 같은 경우
            if (a == b && a == c) {
                System.out.println(10000 + a * 1000);
            }
            else {
                // a가 b혹은 c랑만 같은 경우
                if(a == b || a == c) {
                    System.out.println(1000 + a * 100);
                }
                // b가 c랑 같은 경우
                else {
                    System.out.println(1000 + b * 100);
                }
            }
        }

        // 틀림
        /*
        Scanner scanner = new Scanner(System.in);
        String[] dice = scanner.nextLine().split(" ");
        scanner.close();

        int biggest =  0;
        int du = 0;
        int count = 0;

        for (int i = 1; i < dice.length; i++) {
            if (Integer.parseInt(dice[i]) == Integer.parseInt(dice[i-1])){
                count++;
                du = Integer.parseInt(dice[i]);
            }
            else if(Integer.parseInt(dice[i]) > Integer.parseInt(dice[i-1])){
                biggest = Integer.parseInt(dice[i]);
            } else {
                biggest = Integer.parseInt(dice[i-1]);
            }
        }

        switch (count){
            case 1:
                System.out.println(1000 + du*100);
                break;
            case 2:
                System.out.println(10000 + du*1000);
                break;
            default:
                System.out.println(biggest*100);
                break;
        }
        */
    }
}

package baekjoon.steps.step7;

import java.util.Scanner;

public class _7_2839 {
    public static void main(String[] args){
        // n%5==0,n%5<3, n%5==3, n%5==4
        // n%5==0 -> n/5
        // n%5==3 -> n/5 + 1
        // (n%5==1 || n%5==4) && n/5 >= 1 ->  (n/5 - 1)+((n%5)+5)/3
        // n%5==2 && n/5 >=2 -> (n/5 - 2)+((n%5)+10)/3

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = n / 5;
        int r = n % 5;

        switch (r) {
            case 0:
                System.out.println(q);
                break;
            case 1:
            case 4:
                if (q>=1) {
                    System.out.println(q-1 + (r+5)/3);
                } else {
                    System.out.println(-1);
                }
                break;
            case 2:
                if (q>=2) {
                    System.out.println(q-2 + (r+10)/3);
                } else {
                    System.out.println(-1);
                }
                break;
            case 3:
                System.out.println(q+1);
                break;
        }
    }
}

package inf_kim.section2_Array;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int point = 0;
        scanner.nextLine();
        for (int i = 1; i <= n; i++) {
            int answer = scanner.nextInt();
            if(answer == 1){
                ++point;
            } else {point = 0;}
            sum += point;
        }
        System.out.println(sum);
    }
}

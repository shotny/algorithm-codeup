package inf_kim.section2_Array;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] height = scanner.nextLine().split(" ");
        System.out.println(solution(n, height));
    }

    public static int solution(int n, String[] height) {
        int count = 0;
        int max =  0;

        for (int i = 0; i < n; i++) {
            int now = Integer.parseInt(height[i]);
            if (now > max) {
                ++count;
                max = now;
            }
        }
        return count;
    }
}

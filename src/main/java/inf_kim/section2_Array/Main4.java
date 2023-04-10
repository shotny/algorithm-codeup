package inf_kim.section2_Array;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ll = 1, l=1;
        int sum = 0;

        System.out.printf("%d %d ", ll, l);
        for (int i = 3; i <= n; i++) {
            sum = ll + l;
            System.out.printf("%d ", sum);
            ll = l;
            l = sum;
        }
    }
}

package inf_kim.section2_Array;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] al = scanner.nextLine().split(" ");
        String[] bl = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(al[i]);
            int b = Integer.parseInt(bl[i]);
            String winner = "";
            if (a == b) {
                System.out.println("D");
                continue;
            }
            if ((a == 3 || b == 3) && (a == 1 || b == 1)) {
                winner = a > b ? "B" : "A";
                System.out.println(winner);
                continue;
            }
            winner = a > b ? "A" : "B";
            System.out.println(winner);
        }
    }
}

package inf_kim.section2_Array;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] arr = scanner.nextLine().split(" ");
        solution(n, arr);
    }

    public static void solution(int n, String[] arr) {
        System.out.printf("%s ", arr[0]);
        for (int i = 1; i < n; i++) {
            if (Integer.parseInt(arr[i]) > Integer.parseInt(arr[i - 1])) {
                System.out.printf("%s ", arr[i]);
            }
        }
    }
}

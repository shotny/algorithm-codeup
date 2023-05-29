package inf_kim.section3_TowPointers_SlidingWindow;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] sales = new int[n];
        int init = 0;
        for (int i = 0; i < n; i++) {
            sales[i] = scanner.nextInt();
            if (i < k) {
                init += sales[i];
            }
        }
        if (n == k) {
            System.out.println(init);
        } else mySol(k, init, sales);
    }

    public static void mySol(int k, int init, int[] sales) {
        int answer = init, newsum = 0;
        for (int i = k; i < sales.length; i++) {
            newsum += (sales[i] - sales[i - k]);
            if (newsum > answer) {
                answer = newsum;
            }
        }
        System.out.println(answer);
    }

    public static void infSol(int k, int n, int[] arr) {
        int answer = 0, sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        answer = sum;
        for (int i=k;  i< n; i++) {
            sum += (arr[i] - arr[i - k]);
            answer = Math.max(sum, answer);
        }
    }
}

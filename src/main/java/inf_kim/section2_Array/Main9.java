package inf_kim.section2_Array;

import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int[][] board = new int[n][n];
        int answer = 0;

        // 가로
        for (int i = 0; i < n; i++) {
            String[] numbers = scanner.nextLine().split(" ");
            int sum = 0;
            for (int j = 0; j < numbers.length; j++) {
                sum += Integer.parseInt(numbers[j]);
                board[i][j] = Integer.parseInt(numbers[j]);
            }
            if (sum > answer) {
                answer = sum;
            }
        }

        // 세로
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += board[j][i];
            }
            if (sum > answer) {
                answer = sum;
            }
        }

        // 대각선
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += board[i][i];
            sum2 += board[i][n - 1 - i];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        System.out.println(answer);
    }
}


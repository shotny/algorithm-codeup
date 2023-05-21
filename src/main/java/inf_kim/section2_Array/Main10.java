package inf_kim.section2_Array;

import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] board = new int[n+2][n+2];
        int answer = 0;

        // 가장자리 0으로 초기화
        for (int i = 0; i < n + 2; i++) {
            board[0][i] = 0;
            board[n+1][i] = 0;
            board[i][0] = 0;
            board[i][n+1] = 0;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                board[i][j] = scanner.nextInt();
                System.out.printf("%d", board[i][j]);
            }
            System.out.println();
        }
        scanner.close();

        boolean isPeak = true;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++){
                isPeak = true;
                if (board[i][j] < board[i - 1][j] || board[i][j] < board[i + 1][j] || board[i][j] < board[i][j - 1] || board[i][j] < board[i][j + 1]) {
                    isPeak = false;
                }
                if(isPeak){++answer;}
            }
        }

        System.out.println(answer);
    }
}
// 상하좌우 네 번 비교
// 가장 자리 값은 0
// board[i][j] 일때,
// if(i==0){'상'은 비교 안함}
// if(i==n-1){'하'는 비교 안함}
// if(j==0){'좌'비교안함}
// if(j==n-1){'우' 비교 안함}
// x -- 각 격자판의 자연수가 0 이상이라는 조건 없음~~ :)

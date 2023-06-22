package inf_kim.section5_Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Main3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] board = new int[n][n];
        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++){board[i][j] = scanner.nextInt();}
        }
        int m = scanner.nextInt();
        int[] move = new int[m];
        for(int i=0; i<m; i++){move[i] = scanner.nextInt();}

        System.out.println(mySol(board, move));
        System.out.println(infSol(board, move));
    }
    static int mySol(int[][] board, int[] move){
        int answer = 0;
        Stack<Integer> bucket = new Stack<Integer>();

        // move
        for(int p : move){
            int get = 0;
            for(int i=0; i<board.length; i++){
                if(board[i][p-1] != 0){
                    get = board[i][p-1];
                    board[i][p-1] = 0;
                    break;
                }
            }
            if(bucket.size() > 0 && bucket.peek() == get){
                bucket.pop();
                answer += 2;
            } else {bucket.push(get);}
        }
        return answer;
    }

    static int infSol(int[][] board, int[] moves){
        int answer = 0;
        Stack<Integer> stack = new Stack<Integer>();

        for(int pos : moves){
            for(int i=0; i<board.length; i++){
                if(board[i][pos-1]!=0){
                    int tmp = board[i][pos-1];
                    board[i][pos-1] = 0;
                    if(!stack.isEmpty() && tmp == stack.peek()){
                        answer += 2;
                        stack.pop();
                    } else stack.push(tmp);
                    break;
                }
            }
        }

        return answer;
    }
}
// 게임 화면의 격자의 상태가 담긴 2차원 배열 board와 인형을 집기 위해 크레인을 작동시킨 위치가 담긴 배열 moves가 매개변수로 주어질 때,
// 크레인을 모두 작동시킨 후 터트려져 사라진 인형의 개수를 구하는 프로그램을 작성

// 각 세로열을 스택에 집어 넣은 후 move 순서대로 스택을 돈다.
// board[i][move-1]에서 i가 0이 아닐 때까지 탐색해 값을 꺼내고 0을 할당
// 스택에 값이 있으면 pop, pop한 값이 장바구니 top과 동일하면 answer++후 장바구니 pop.

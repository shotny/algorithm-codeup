package inf_kim.section3_TowPointers_SlidingWindow;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(mySol(n));
        System.out.println(infSol(n));
    }

    static int mySol(int n) {
        int answer=0, l=1, sum =0;
        for (int r = 1; r <= n / 2 + 1; r++) {
            sum += r;
            if(sum < n) {continue;}
            if(sum > n){
                while (sum > n && l < n/2+1) {
                    sum -= l++;
                }
            }
            if(sum == n){++answer;}
        }
        return answer;
    }

    static int infSol(int n){
        int answer=0, sum=0, lt=0;
        int m=n/2+1;
        int[] arr = new int[m];
        for (int i=0; i<m; i++){arr[i] = i+1;}
        for(int rt=0; rt<m; rt++){
            sum += arr[rt];
            if(sum == n){answer++;}
            while (sum >= n){
                sum -= arr[lt++];
                if(sum == n){answer++;}
            }
        }
        return answer;
    }
}
// 양의 정수 n이 주어지면, 연속된 자연수의 합이 n이 되는 경우가 몇 번있는지 출력
// 1부터 n/2+1까지 하나씩 더해가면서 진행
// 더한 값이 n보다 작으면 계속 더한다.
// 더한값이 n과 같으면 ++answer
// 더한값이 n보다 크면 앞에서부터 하나씩 뺴고(앞쪽의 인덱스를 기억한다) n과 비교


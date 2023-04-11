package inf_kim.section2_Array;

import java.util.Scanner;

// 에라토스테네스 체
public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int answer = 0;
        boolean[] prime = new boolean[n+1];

        for (int i = 2; i < n+1; i++) {
            if(prime[i]){continue;}
            for(int j=i+i; j<=n;){
                prime[j] = true;
                j = j+i;
            }
        }

        for (int i = 2; i <= n; i++) {
            if (!prime[i]) {
                ++answer;
            }
        }
        return answer;
    }
}

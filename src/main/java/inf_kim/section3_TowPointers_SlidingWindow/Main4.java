package inf_kim.section3_TowPointers_SlidingWindow;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        if (n == 1) {
            if(arr[0] == m){
                System.out.println(1);
            } else System.out.println(0);
        } else mySol(m, arr);
//        infSol(n, m, arr);
    }

    static void mySol(int m, int[] arr) {
        int sum = arr[0], p = 0, answer = 0;
        if (sum == m){ ++answer; }
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
            if(sum < m ) continue;
            if (sum > m) {
                while (sum > m && p < i) {
                    sum -= arr[p++];
                }
            }
            if (sum == m) ++answer;
        }
        System.out.println(answer);
    }

    static void infSol(int n, int m, int[] arr) {
        int answer=0, sum=0, lt=0;
        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if(sum == m) answer++;
            while (sum >= m) {
                sum -= arr[lt++];
                if(sum == m) answer++;
            }
        }
        System.out.println(answer);
    }
}

// 수열에서 연속부분수열의 합이 특정숫자 m이 되는 경우가 몇번있는지 구하는 프로젝트
// 총합에 수열을 하나씩 더한다. 합이 m과 같으면 ++answer. 합이 m보다 크면 가장 앞 인덱스에 해당하는 원소값을 뺀 후 인덱스를 증가한다.
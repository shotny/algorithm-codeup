package inf_kim.section2_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        scanner.nextLine();
//        String[] arr = scanner.nextLine().split(" ");
//        solution(arr);

        // 방법2
//        int n = scanner.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = scanner.nextInt();
//        }
//        for (int x : solution(n, arr)) {
//            System.out.print(x+" ");
//        }
    }

    public static ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int tmp = arr[i];
            int res  = 0;
            while(tmp > 0){
                int t = tmp % 10;
                res = res * 10 + t;
                tmp = tmp/10;
            }
            if (isPrime(res)) {
                answer.add(res);
            }
        }
        return answer;
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /*
    public static void solution(String[] arr){
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            s.append(arr[i]).reverse();

            StringBuilder reversed = new StringBuilder();
            for (char x : s.toString().toCharArray()) {
                if (x != '0') {
                    reversed.append(x);
                }
            }

            int now = Integer.parseInt(reversed.toString());
            boolean isPrime = true;
            if(now == 1){ continue; }
            for (int j = 2; j < now; j++) {
                if (now % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.printf("%d ", now);
            }

            s.delete(0, s.length());
        }
    }*/
}

package inf_kim.section3_TowPointers_SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] narr = new int[n];
        for (int i = 0; i < n; i++) {
            narr[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] marr = new int[m];
        for (int i = 0; i < m; i++) {
            marr[i] = scanner.nextInt();
        }
//        mySol(narr, marr);
        infSol(n, m, narr, marr);
    }

    public static void mySol(int[] narr, int[] marr) {
        int[] answer = new int[narr.length + marr.length];

        // 배열 합치기
        for (int j = 0; j < narr.length; j++) {
            answer[j] = narr[j];
        }
        int index = narr.length;
        for (int k = 0; k < marr.length; k++) {
            answer[index] =marr[k];
            ++index;
        }

//        Arrays.sort(answer);

        //버블정렬
        for (int i = 0; i < answer.length - 1; i++) {
            for (int j = i + 1; j < answer.length; j++) {
                if (answer[j] < answer[i]) {
                    int tmp = answer[j];
                    answer[j] = answer[i];
                    answer[i] = tmp;
                }
            }
        }

        for (int x : answer) {
            System.out.print(x+" ");
        }
    }

    public static void infSol(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while (p1 < n && p2 < m) {
            if (a[p1]<b[p2]){answer.add(a[p1++]);}
            else {answer.add(b[p2++]);}
        }
        while (p1 < n) {answer.add(a[p1++]);}
        while (p2 < m) {answer.add(b[p2++]);}

        // 내가 이해한 방법
//        int[] answer = new int[n + m];
//        int ai = 0, bi = 0;
//
//        for (int i = 0; i < n + m; i++) {
//            if (ai == n) {
//                answer[i] = b[bi];
//                ++bi;
//                continue;
//            }
//            if (bi == m) {
//                answer[i] = a[ai];
//                ++ai;
//                continue;
//            }
//            if (a[ai] < b[bi]) {
//                answer[i] = a[ai];
//                ++ai;
//            } else {
//                answer[i] = b[bi];
//                ++bi;
//            }
//        }

        for (int x : answer) {
            System.out.printf("%d ",x);
        }
    }
}

package inf_kim.section3_TowPointers_SlidingWindow;

import java.util.*;

// 공통원소 구하기
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int n = scanner.nextInt();
//        ArrayList<Integer> a = new ArrayList<>(n);
//        for (int i = 1; i <= n; i++) {
//            a.add(scanner.nextInt());
//        }
//        int m = scanner.nextInt();
//        ArrayList<Integer> b = new ArrayList<>(m);
//        for (int i = 1; i <= m; i++) {
//            b.add(scanner.nextInt());
//        }


        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }

//        mySol(a, b);
        infSol(n, m, a, b);
    }

    public static void mySol(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < b.size(); j++) {
                if (a.get(i) == b.get(j)) {
                    answer.add(b.get(j));
                    b.remove(b.get(j));
                    break;
                }
            }
        }

        Collections.sort(answer);
        for (Integer x : answer) {
            System.out.printf("%d ", x);
        }
    }

    public static void infSol(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int p1 = 0, p2 = 0;
        while (p1 < n && p2 < m) {
            if( a[p1] == b[p2] ) {
                answer.add(a[p1++]);
                p2++;
            }
            else if ( a[p1] < b[p2] ) {p1++;}
            else {p2++;}
        }
        for (int x : answer) {
            System.out.printf("%d ", x);
        }
    }
}

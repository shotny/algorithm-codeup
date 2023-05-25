package inf_kim.section2_Array;

import java.util.*;

public class Main12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int students = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] test = new int[students][students];

        if (n == 1){
            System.out.println(students * (students - 1) / 2);
            return;
        }
        if (students == 1) {
            System.out.println(0);
            return;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < students; j++) {
                test[i][j] = scanner.nextInt();
            }
        }

        System.out.println(mySolution(students, n, test));
        System.out.println(infSolution(students, n, test));
    }


    // 첫테스트 결과에서 각 학생의 후순위에 있는 학생들을, 각 학생별로 배열에 넣는다.
    // 이후 테스트에서 후순위와 배열을 비교해, 동일하게 후순위면 그대로 두고 없으면 0을 넣는다.
    public static int mySolution(int students, int n, int[][] test){
        int[][] cases = new int[students + 1][students + 1];
        int result = 0;

        // 테스트 횟수만큼 반복
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < test[i].length-1; j++) {
                int student = test[i][j];
                for (int k = j + 1; k < test[i].length; k++) {
                    ++cases[student][test[i][k]];
                }
            }
        }

        for (int i = 1; i < cases.length; i++) {
            for (int j = 1; j < cases[i].length; j++) {
                if (cases[i][j] == n) {
                    ++result;
                }
            }
        }

        return result;
    }

    //해설
    public static int infSolution(int n, int m, int[][] arr) {
        int answer=0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                int count = 0;
                for (int k = 0; k < m; k++) {
                    int pi =0, pj =0;
                    for (int s = 0; s < n; s++) {
                        if (arr[k][s] == i) {pi = s;}
                        if (arr[k][s] == j) {pj = s;}
                    }
                    if(pi > pj){++count;}
                }
                if(count == m){ ++answer;}
            }
        }
        return answer;
    }
}

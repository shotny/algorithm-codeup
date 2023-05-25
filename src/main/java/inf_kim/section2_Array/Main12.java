package inf_kim.section2_Array;

import java.util.*;

public class Main12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] test = new int[students][students];
        int[][] cases = new int[students + 1][students + 1];
        int result = 0;

        // 첫테스트 결과에서 각 학생의 후순위에 있는 학생들을, 각 학생별로 배열에 넣는다.
        // 이후 테스트에서 후순위와 배열을 비교해, 동일하게 후순위면 그대로 두고 없으면 0을 넣는다.

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
//                System.out.printf(" %d ",test[i][j]);
            }
//            System.out.println();
        }

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

        System.out.println(result);
    }
}

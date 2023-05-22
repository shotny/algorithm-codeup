package inf_kim.section2_Array;

import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int[] result = new int[2];
        int students = scanner.nextInt();
        int[][] table = new int[students][5];

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 5; j++) {
                table[i][j] = scanner.nextInt();
            }
        }

//        // 한명씩
//        for (int i = 0; i < students; i++) {
//            count = 0;
//            // 한 학년씩
//            for (int j = 0; j < 5; j++) {
//                compare = table[i][j];
//                for (int k = 0; k < students; k++) {
//                    if(k==i){continue;}
//                    if (table[k][j] == compare) {
//                        ++count;
//                    }
//                }
//            }
//            if (count > result[1]){
//                result[1] = count;
//                result[0] = i;
//            }
//        }

        // 같은 반인 학생은 한 번만 카운트해야함!
        // 한 명씩
        for (int i = 0; i < students; i++) {
            count = 0;
            // 비교도 한명씩
            for (int k = 0; k < students; k++) {
                if(k==i){continue;}
                // 한 학년씩
                for (int j = 0; j < 5; j++) {
                    if (table[i][j] == table[k][j]){
                        ++count;
                        break;
                    }
                }
            }
            if (count > result[1]) {
                result[1] = count;
                result[0] = i;
            }
        }

        System.out.println(result[0]+1);
    }
}
// 같은 반이었던 사람이 가장 많은 학생을 임시반장으로
// 세로로 비교해서 값이 같을 때 카운트 업

package programmers.lv0;

import java.util.Scanner;

public class _3_연속된수의합 {

    class Solution{
        public int[] solution(int num, int total) {

            /*
            int[] answer = new int[num];
            int sum = 0;
            int count = 0;
            int lastNum = 0;

            for (int i = total / 2; sum <= total; i--) {
                int tmp = i;
                for (int j = 1; j<=num; j++) {
                    sum += tmp;
                    lastNum = tmp;
                    --tmp;
                }
                if (sum == total) {
                    for (int j = num - 1; j >= 0; j--) {
                        answer[j] = lastNum;
                        --lastNum;
                    }
                    break;
                }

                if (count == num && sum < total) {
                    for (int j = total / 2; sum <= total; j++) {
                        tmp = j;
                        for (int k = 1; k <= num; k++) {
                            sum += j;
                            lastNum = j;
                            ++tmp;
                        }
                        if (sum == total) {
                            for (int k = 0; k < num; k++) {
                                answer[k] = lastNum;
                                ++lastNum;
                            }
                            break;
                        }
                    }
                }
            }

            for (int i = 0; i < num; i++) {
                System.out.printf("%d, ", answer[i]);
            }*/

            return answer;
        }
    }
}

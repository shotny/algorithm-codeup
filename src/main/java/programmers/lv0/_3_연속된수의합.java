package programmers.lv0;

import java.util.Scanner;

public class _3_연속된수의합 {

    class Solution{
        public int[] solution(int num, int total) {
            int startNum = 0;
            int testSum;

            if (num / 2 == 0) {
                startNum = total / num - (num / 2);
            }

            if (total % num == 0) {
                startNum = total / num - ((num - 1) / 2);
            }

            testSum = isRight(startNum, num);
            while (testSum != total){
                if (testSum < total) {
                    ++startNum;
                    testSum = isRight(startNum, num);
                } else {
                    --startNum;
                    testSum = isRight(startNum, num);
                }
            }
            return createArr(startNum, num);
        }

        public int isRight (int startNum, int num) {
            int sum = 0;
            for (int i = 0; i < num; i++) {
                sum += startNum;
                ++startNum;
            }
            return sum;
        }

        public int[] createArr(int startNum, int num) {
            int[] answer = new int[num];
            for (int i = 0; i < num; i++) {
                answer[i] = startNum;
                ++startNum;
            }
            return answer;
        }
    }
}

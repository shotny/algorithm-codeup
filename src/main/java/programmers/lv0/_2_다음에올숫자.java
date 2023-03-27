package programmers.lv0;

// 등차수열 혹은 등비수열 common이 매개변수로 주어질 때, 마지막 원소 다음으로 올 숫자를 return
public class _2_다음에올숫자 {

    class Solution {
        public int solution(int[] common) {
            int answer = 0;
            int x = 0;
            boolean isEqualGrade = true;

            for (int i = 2; i < common.length; i++) {
                if ((common[i] - common[i - 1]) != (common[i - 1] - common[i - 2])) {
                    answer = common[common.length - 1] * (common[common.length - 1] / common[common.length - 2]);
                } else {
                    answer = common[common.length - 1] + (common[common.length - 1] - common[common.length - 2]);
                }
            }

        /* 실패 - 등비가 아닐 경우로 진행
        : 나누는 수가 0일 경우 런타임에러 발생
        for(int i = 1; i < common.length; i++){
            if(!isEqualRatio){
                break;
            }

            if(common[i] % common[i-1] != 0){
                isEqualRatio = false;
                x = common[i] - common[i-1];
            } else {
                x = common[i] / common[i-1];
            }
        }

        if(isEqualRatio){
            answer = common[common.length - 1] * x;
        } else {
            answer = common[common.length - 1] + x;
        }
        */

            return answer;
        }
    }
}

/*
* - 등비수열의 경우: 원소가 약수관계
*   1. 등비를 담을 변수 x 선언
*   2. (n+1)을 n으로 나눈 나머지가 0,(n+2)을 (n+1)로 나눈 나머지가 0 .. 이 반복되면 몫을 변수 x에 할당
*   3. return 마지막원소 * x;
*
*  - 등차수열의 경우: 등비수열이 아닌 경우
*   1. (n+1) - n 의 값을 x에 할당
*   2. return 마지막원소 + x;
*/

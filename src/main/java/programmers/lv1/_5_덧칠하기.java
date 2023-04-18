package programmers.lv1;

public class _5_덧칠하기 {
    public static void main(String[] args) {
        int[] section = new int[]{2, 3, 6};
        Solution s = new Solution();
        System.out.println(s.solution(8, 4, section));
    }
    public static class Solution{
        public int solution(int n, int m, int[] section) {
            int answer = 0;
            int painting = 0;
            for (int s : section) {
                if (s > painting) {
                    painting = s + m - 1;
                    ++answer;
                }
            }
            return answer;
        }
    }
}

// |1|2|3|...|n|, 롤러길이 m, 다시 칠할 구역 []
// 다시 칠할 배열을 돌며 '구역너버+롤러길이-1'의 값을 구한 후 다음 구역을 포함하면 패스, 포함하지 않으면 카운트++

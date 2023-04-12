package programmers.lv1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _3_달리기경주 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] players = scanner.nextLine().split(" ");
        String[] callings = scanner.nextLine().split(" ");

        Solution s = new Solution();
        String[] answer = s.solution(players, callings);
        for (String x : answer) {
            System.out.println(x);
        }
    }

    public static class Solution{
        public static String[] solution(String[] players, String[] callings) {
            String[] answer = players.clone();

            for (int i = 0; i < callings.length; i++) {
                String change = callings[i];

                for (int j = 1; j < answer.length; j++) {
                    if (answer[j].equals(change)) {
                        answer[j] = answer[j - 1];
                        answer[j - 1] = change;
                        break;
                    }
                }
            }

            return answer;
        }
    }
}

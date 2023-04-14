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

        public static String[] solution(String[] players, String[] callings){
            Map<String, Integer> rank = new HashMap<>();
            for (int i = 0; i < players.length; i++) {
                rank.put(players[i], i);
            }

            for (String call : callings) {
                int preRank = rank.get(call);
                int chaRank = preRank-1;
                String changedPlayer = players[chaRank];
                players[chaRank] = call;
                players[preRank] = changedPlayer;
                rank.replace(call, preRank, chaRank);
                rank.replace(changedPlayer, chaRank, preRank);
            }

            return players;
        }
        /*
        public static String[] solution2(String[] players, String[] callings){
            String[] answer = new String[players.length];
            Map<String, Integer> playerArr = new HashMap<>();
            Map<Integer, String> rankArr = new HashMap<>();

            for (int i = 0; i < players.length; i++) {
                playerArr.put(players[i], i);
                rankArr.put(i, players[i]);
            }

            for (int i = 0; i < callings.length; i++) {
                String now = callings[i];
                Integer rank = playerArr.get(now);
                String changedPlayer = rankArr.get(rank - 1);
                rankArr.replace(rank-1, changedPlayer, now);
                rankArr.replace(rank, now, changedPlayer);
                playerArr.replace(now, rank, rank-1);
                playerArr.replace(changedPlayer, rank - 1, rank);
            }

            for (int i = 0; i < rankArr.size(); i++) {
                answer[i] = rankArr.get(i);
            }

            return answer;
        }*/

        /*
        public static String[] solution3(String[] players, String[] callings) {
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
        }*/
    }
}

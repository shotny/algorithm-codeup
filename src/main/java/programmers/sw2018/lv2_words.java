package programmers.sw2018;

import java.util.ArrayList;

public class lv2_words {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] words = new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        int[] answer = s.solution(3, words);
        System.out.printf("%d,%d",answer[0],answer[1]);
    }
    public static class Solution {
        public int[] solution(int n, String[] words) {
            int[] answer = new int[2];
            StringBuilder answers = new StringBuilder(words[0]);
            char bridge = words[0].charAt(words[0].length()-1);

            ArrayList<String> list = new ArrayList<>();
            list.add(words[0]);

            for(int i=1; i<words.length; i++){
//                if(words[i].charAt(0) != bridge || answers.toString().contains(words[i])){
                if(words[i].charAt(0) != bridge || list.contains(words[i]) || words[i].length() == 1){
                    answer[0] = i % n + 1;
                    answer[1] = (i / n) + 1;
                    break;
                }
                bridge = words[i].charAt(words[i].length()-1);
                list.add(words[i]);
//                answers.append(words[i]).append(" ");
            }

            return answer;
        }
    }
}

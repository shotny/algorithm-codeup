package programmers.sw2018;

public class lv2_skillTree {
    public static void main(String[] args) {

    }

    class Solution {
        public int solution(String skill, String[] skill_trees) {
            int answer = 0;

            for(String s : skill_trees){
                StringBuilder sb = new StringBuilder(skill);
                boolean isRight = true;

                for(char c : s.toCharArray()){
                    if(!sb.toString().contains(String.valueOf(c))){
                        continue;
                    }
                    if(c != sb.toString().charAt(0)){
                        isRight = false;
                        break;
                    }
                    if(sb.length()>1){
                        sb.deleteCharAt(0);
                    }
                }

                if(isRight){ ++answer;}
            }

            return answer;
        }
    }
}

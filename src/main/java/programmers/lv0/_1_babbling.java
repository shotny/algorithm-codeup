package programmers.lv0;

public class _1_babbling {
    public static int solution(String[] babbling) {
        int answer = 0;

        for (String word : babbling) {
            word = word.replace("aya", " ");
            word = word.replace("ye", " ");
            word = word.replace("woo", " ");
            word = word.replace("ma", " ");
            word = word.replace(" ", "");
            if(word.length() == 0){ ++answer; }
        }

        /* 실패 :)
        String[] possible = new String[] {"aya", "ye", "woo", "ma"};

        for (String str : babbling) {
            String tmp = str;
            StringBuilder sb = new StringBuilder(str);

            for (String able : possible) {
                if (str.contains(able)) {
                    int x = str.indexOf(able);
                    str = sb.delete(str.indexOf(able), str.indexOf(able) + able.length()).toString();
                }
            }

            if (str.equals("")) {
                ++answer;
            }
        } */

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        String[] test = new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
        solution(test);
    }
}
// "aya", "ye", "woo", "ma" 네 가지 발음을 최대 한 번씩 조합해 이어 붙인 발음만 가능
// 문자열 배열이 주어질 때 발음할 수 있는 단어 개수를 return

// 1.


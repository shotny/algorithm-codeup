package inf_kim.section1_String;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(solution(str));
    }


    // 방법 2
    public static String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE, pos;

        while ((pos = str.indexOf(' ')) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > m) {
                m = len;
                answer = tmp;
            }
            str = str.substring(pos + 1);
        }
        if (str.length() > m) {
            answer = str;
        }
        return answer;
    }

    /* 방법 1
    public static String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE; // 가장 작은 값으로 초기화
        String[] s = str.split(" ");
        for (String x : s) {
            int len = x.length();
            if (len > m) {
                m = len;
                answer = x;
            }
        }
        return answer;
    }*/

    /* 내 풀이
    public static String solution(String str) {
        String answer = "";
        for (String s : str.split(" ")) {
            if (s.length() > answer.length()) {
                answer = s;
            }
        }
        return answer;
    } */
}

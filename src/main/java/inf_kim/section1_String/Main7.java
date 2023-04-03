package inf_kim.section1_String;

import java.util.Scanner;

//회문 문자열
public class Main7 {
    public static void main(String[] args) {
    }

    public String solution(String str) {
        String answer = "Yes";
        String tmp = new StringBuilder(str).reverse().toString();
        if (!str.equalsIgnoreCase(tmp)) {
            answer = "No";
        }
        return answer;
    }
    public String solutionMy(String str) {
        str = str.toLowerCase();
        String result = "YES";

        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                result = "NO";
                break;
            }
        }
        return result;
    }
}

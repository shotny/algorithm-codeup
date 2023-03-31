package inf_kim.section1_String;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(solution(str));
    }

    public static String solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }
        return answer;
    }

    public String solutionMy(String str) {
        String result = "";

        for (char x : str.toCharArray()) {
            if (!result.contains((String.valueOf(x)))) {
                result += x;
            }
        }
        return result;
    }
}

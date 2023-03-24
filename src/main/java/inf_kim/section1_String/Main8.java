package inf_kim.section1_String;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(solution(str));
    }

    public static String solution(String s) {
        String answer = "NO";
        s = s.toUpperCase().replaceAll("[^A-Z]", "");
        String reversed = new StringBuilder(s).reverse().toString();
        if (s.equals(reversed)) {
            answer = "YES";
        }
        return answer;
    }
}

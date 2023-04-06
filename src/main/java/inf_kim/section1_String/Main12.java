package inf_kim.section1_String;

import java.util.Scanner;

public class Main12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String str = scanner.nextLine();

        System.out.println(solution(n, str));
    }

    public static String solution(int n, String str) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2);
            answer += (char)num;
            str = str.substring(7);
        }
        return answer;
    }

    public static String solutionMy(int n, String str) {
        StringBuilder answer = new StringBuilder();
        StringBuilder binary = new StringBuilder();
        int start = 0;

        for (int i = 1; i <= n; i++) {
            String each = str.substring(start, start + 7);
            for (char x : each.toCharArray()) {
                if (x == '#') {
                    binary.append("1");
                } else binary.append("0");
            }

            int decimal = Integer.parseInt(binary.toString(), 2);
            answer.append((char) decimal);

            binary.delete(0, binary.length());
            start += 7;
        }

        return answer.toString();
    }
}

// #과 *로 이뤄진 이진수 -> 십진수 = 아스크번호
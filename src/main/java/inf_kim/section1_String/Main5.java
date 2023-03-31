package inf_kim.section1_String;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

//        solutionMy(str);
        System.out.println(solution(str));
    }

    static String solution(String str) {
        String answer = "";
        char[] s = str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;

        while (lt < rt) {
            if (!Character.isAlphabetic(s[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(rt)) {
                rt++;
            } else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt++;
            }
        }
        answer = String.valueOf(s);
        return answer;
    }

    static void solutionMy(String str){
        char[] chars = str.toCharArray();
        char[] result = new char[chars.length];
        String alphabets = "";

        for (int i = 0; i < chars.length; i++) {
            char x = chars[i];
            if (!((65 <= x && x <= 90) || (97 <= x && x <= 122))) {
                result[i] = x;
            } else {
                alphabets += x;
            }
        }

        int index = 1;
        for (int i = 0; i < result.length; i++) {
            if (result[i] == '\u0000') {
                result[i] = alphabets.charAt(alphabets.length() - index);
                ++index;
            }
        }

        for (char x : result) {
            System.out.print(x);
        }
    }
}

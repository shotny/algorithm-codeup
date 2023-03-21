package inf_kim.section1_String;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] chars = scanner.nextLine().toCharArray();
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

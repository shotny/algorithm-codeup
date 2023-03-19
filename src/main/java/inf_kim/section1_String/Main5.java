package inf_kim.section1_String;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int index = str.length() - 1;
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char now = str.charAt(i);
            if (!((65 <= now && now <= 90) || (97 <= now && now <= 122))) {
                result += now;
                continue;
            }

            char reversed = str.charAt(index - i);
            if ((65 <= reversed && reversed <= 90) || (97 <= reversed && reversed <= 122)) {
                result += reversed;
            } else {
                int j = 1;
                reversed = str.charAt(index - i - j);
                do {
                    if ((65 <= reversed && reversed <= 90) || (97 <= reversed && reversed <= 122)) {
                        result += reversed;
                        break;
                    } else {
                        ++j;
                        reversed = str.charAt(index - i - j);
                    }
                } while (true);
            }
        }
        System.out.println(result);
        // 1) i번째 문자가 알파벳일 때 -> 반대편 문자가 1.알파벳일 때 / 2.알파벳이 아닐때
        // 2) i번째 문자가 알파벳이 아닐때
    }
}

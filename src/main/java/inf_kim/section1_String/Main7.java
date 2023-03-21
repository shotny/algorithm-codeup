package inf_kim.section1_String;

import java.util.Scanner;

//회문 문자열
public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().toLowerCase();
        String result = "YES";

        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                result = "NO";
                break;
            }
        }
        System.out.println(result);
    }
}

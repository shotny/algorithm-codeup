package inf_kim.section1_String;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String result = "";

        for (char x : s.toCharArray()) {
            if (!result.contains((String.valueOf(x)))) {
                result += x;
            }
        }
        System.out.println(result);
    }
}

package inf_kim.section1_String;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String str = scanner.nextLine();
            StringBuffer sb = new StringBuffer(str);
            System.out.println(sb.reverse());
        }
    }
}

package inf_kim.section1_String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

//        solutionMy(n);

        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = scanner.next();
        }
        for (String x : solution1(n, str)) {

        }

    }

    public static ArrayList<String> solution2(int n, String[] strings) {
        ArrayList<String> answer = new ArrayList<>();
        for (String x : strings) {
            char[] c = x.toCharArray();
            int lt = 0, rt = x.length() - 1;
            while (lt < rt) {
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;

                ++lt;
                --rt;
            }
            String tmp = String.valueOf(c);
            answer.add(tmp);
        }
        return answer;
    }

    public static ArrayList<String> solution1(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for (String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }

    public static void solutionMy(int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            String str = scanner.nextLine();
            StringBuffer sb = new StringBuffer(str);
            System.out.println(sb.reverse());
        }
    }
}

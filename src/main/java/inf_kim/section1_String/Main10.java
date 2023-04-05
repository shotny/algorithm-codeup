package inf_kim.section1_String;

import java.awt.print.Pageable;
import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char t = scanner.next().charAt(0);

        for (int x : solution(str, t)) {
            System.out.print(x + " ");
        }

        /*
        Scanner scanner = new Scanner(System.in);
        String[] ex= scanner.nextLine().split(" ");
        String s = ex[0];
        String t = ex[1];

        s.replace(t, " ");
        String[] arr = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            int distance;

            if (arr[i].length() == 1) {
                result.append("1 ");
                continue;
            }

            for (int j = 0; i < arr[i].length(); j++) {
                if (j + 1 <= arr[i].length() / 2) {
                    distance = j + 1;
                } else {
                    distance = arr.length - j;
                }
                result.append(distance);
                result.append(" ");
            }

            if (i != arr.length - 1) {
                result.append("0 ");
            }
        }

        System.out.println(result.toString());*/
    }

    public static int[] solution(String str, char t) {
        int[] answer = new int[str.length()];
        int p = 100;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == t) {
                p = 0;
            } else {
                ++p;
            }
            answer[i] = p;
        }
        p = 100;
        for (int i = str.length() - 1; i >= 0; i--) {
            if(str.charAt(i) == t) {
                p = 0;
                answer[i] = p;
            } else {
                ++p;
                answer[i] = Math.min(answer[i], p);
            }
        }
        return answer;
    }
}

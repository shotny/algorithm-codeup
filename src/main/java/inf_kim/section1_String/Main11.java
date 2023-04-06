package inf_kim.section1_String;

import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(solution(str));
    }

    public static String solution(String str) {
        StringBuilder answer = new StringBuilder();
        int count = 1;

        if (str.length() == 1) {
            return str;
        }

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                ++count;
            } else {
                answer.append(str.charAt(i - 1));
                if (count > 1) {
                    answer.append(count);
                }
                count = 1;
            }
            if (i == str.length() - 1) {
                if (count > 1) {
                    answer.append(str.charAt(i - 1));
                    answer.append(count);
                } else {
                    answer.append(str.charAt(i));
                }
            }
        }

        return answer.toString();
    }
}

// 결과 담을 변수 answer, 같은 문자인지 비교할 변수 tmp="", 몇 번 반복되는지 카운트할 변수 count=1
// 첫글자부터 시작해, tmp 같으면 count++;
// 다르면 answer.append(tmp) && count > 1 이면 answer.append(count)

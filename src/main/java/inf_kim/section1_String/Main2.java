package inf_kim.section1_String;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(solution(str));
    }
    public static String solution(String str){
        String answer = "";
        for (char x : str.toCharArray()) {
            if(Character.isLowerCase(x)){
                answer += Character.toUpperCase(x);
            } else answer += Character.toLowerCase(x);
        }
        return answer;
    }

    /* 내 풀이
    public static String solution(String str){
        String answer = "";
        for (String x : str.split("")) {
            if (x.charAt(0) >= 97) {
                answer+=x.toUpperCase();
            } else answer += x.toLowerCase();
        }
        return answer;
    } */
}

// Character 클래스에 대소문자 구분할 수 있는 메서드 있음 .isLowerCase()

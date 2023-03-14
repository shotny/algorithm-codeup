package inf_kim.section1_String;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Main1 T = new Main1();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char t = kb.next().charAt(0);
        System.out.println(T.solution(str, t));
    }

    public int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        //향상된 for문
        for (char x : str.toCharArray()) {
            if(x == t) ++answer;
        }

        /* 방법 1
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == t) ++answer;
        } */

        return answer;
    }


    // 대소문자 구분 안 함 -> uppercase 혹은 lowercase 이용
    // 향상된 for문 사용-> 배열 혹은 Iterator 제공하는 컬랙션을 이용하기 위해 String.toCharArray()사용


    /* 내 풀이
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().toLowerCase();
        char check = scanner.nextLine().toLowerCase().charAt(0);

        System.out.println(solution(str, check));
    }
    public static int solution(String str, char check) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == check) {
                ++count;
            }
        }
        return count;
    }*/
}
package baekjoon.steps.step6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class _5_10988 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int mid = word.length() / 2;
        int isPalindrome = 1;
        for (int i = 0; i < mid; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrome = 0;
            }
        }
        System.out.println(isPalindrome);

//
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String word = reader.readLine();
//        reader.close();
//
//        String[] split = word.split("");
//        int n = (word.length() - 1) / 2;
//        boolean isPalindrome = true;
//
//        if (word.length() % 2 != 0) {
//            for (int i = 0; i < n; i++) {
//                if ((word.charAt(i)-0) == (word.charAt(word.length()-1-i)-0)) {
//                    isPalindrome = true;
//                } else {
//                    isPalindrome = false;
//                    break;
//                }
//            }
//        } else {
//            for (int i = 0; i <= n; i++) {
//                if ((word.charAt(i)-0) == (word.charAt(word.length()-1-i)-0)) {
//                    isPalindrome = true;
//                } else {
//                    isPalindrome = false;
//                    break;
//                }
//            }
//        }
//
//        if (isPalindrome) {
//            System.out.println(1);
//        } else {
//            System.out.println(0);
//        }
    }
}

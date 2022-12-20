package baekjoon.steps.step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5_1157 {
    // 가장 많이 사용된 알파벳을 대문자로 출력. 여러 개 존재하는 경우 ? 출력
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine().toUpperCase();
        int[] alphabet = new int[90 - 64];

        for (int j = 0; j < s.length(); j++) {
            int unicode = (int) s.charAt(j) - 65;
            alphabet[unicode] += 1;
        }

        //  수정
        int max = 0;
        char result = '?';
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] > max) {
                max = alphabet[i];
                result = (char)(i+'A');
            } else if (alphabet[i] != 0 && alphabet[i] == max) {
                result = '?';
            }
        }
        System.out.println(result);

        /* 수정 전 - 틀렸습니다
        int max = alphabet[0];
        int maxIndex = 0;
        int duplicateCheck = 0;

        for (int i = 1; i < alphabet.length; i++) {
            if (alphabet[i] > max) {
                max = alphabet[i];
                maxIndex = i;
            } else if (alphabet[i] != 0 && alphabet[i] == max) {
                duplicateCheck++;
            }
        }

        if (duplicateCheck >= 1) {
            System.out.println("?");
        } else {
            System.out.println((char)(maxIndex+65));
        }*/
    }
}

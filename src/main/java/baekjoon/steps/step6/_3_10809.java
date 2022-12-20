package baekjoon.steps.step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _3_10809 {
    public static void main(String[] args)throws IOException {
        // a는 97
        // 소문자 단어 하나 주어짐.
        // a-z 까지 돌면서 해당 알파벳이 단어의 몇번째에 있는지 출력, 없으면 -1
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word = reader.readLine();

        for (char c = 'a'; c <= 'z'; c++) {
            boolean check = false;
            for (int i = 0; i < word.length(); i++) {
                if (c == word.charAt(i)) {
                    System.out.print(i + " ");
                    check = true;
                    break;
                }
                if (i == word.length() - 1 && check == false) {
                    System.out.print("-1 ");
                }
            } // 해당 알파벳이 단어에 있는지 찾기
        } // a-z 까지 순회
    }
}

package baekjoon.steps.step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10_1316 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int count = 0;
        boolean check = true;

        // 한 알파벳이 붙어있지 않고 떨어져있으면 그룹단어가 아님
        // 한 알파벳이 연속된것과 떨어져있는건 어떻게 구분하지?
        // 지금 나온 알파벳이 이전과 다른지, 다르다면 처음 등장한건지 구분

        loop1:
        for (int i = 0; i < n; i++) {
            String word = reader.readLine();
            String[] list = word.split("");

            for (int j = 1; j < list.length; j++) {
                if(word.charAt(j) != word.charAt(j-1)){
                    if(word.substring(0,j).contains(String.valueOf(word.charAt(j)))){
                        // 현재 문자가 앞 문자와 다르고 이전에 나온적이 있는 경우
                        continue loop1;
                    }
                } else {
                    // 현재 문자가 앞문자와 동일한데 이전에 나온적 있는 경우 aahpaaa

                }
            }
        }

        /*
        for (int i = 0; i < n; i++) {
            String word = reader.readLine();
            for (int j = 1; j < word.length(); j++) {
                String s = String.valueOf(word.charAt(j));
                if (word.substring(0, j).contains(s)) {
                    check = false;
                    break;
                }
                if (j == (word.length() - 1) && check == true) {
                    count++;
                }
            }
        }
        System.out.println(count);*/
    }
}

package baekjoon.steps.step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10_1316 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int count = n;

        // 알파벳 배열을 생성해 새로운 알파벳이 등장하면 true로 체크
        // 현재단어와 이전단어가 다른경우, 현재 단어가 true면 그룹단어 아니고 false면 새로 등장한거니까 true로 변경
        // 단어는 알파벳 소문자로만 되어있다. 아스키코드 a는 97 z는 122

        for (int i = 0; i < n; i++) {
            String word = reader.readLine();
            boolean[] alphabet = new boolean[26]; // 알파벳은 총 26개 _ 새로운 단어 들어오면 false로 초기화

            for (int j = 0; j < word.length() - 1; j++) {
                if (word.charAt(j) != word.charAt(j + 1) && alphabet[word.charAt(j + 1) - 97] == true) {
                    count--;
                    System.out.println(word);
                    break;
                    // 현재알파벳이 다음알파벳이랑 다르고 다음 알파벳이 이전에 나온적 있으면 그룹단어 아님. 더볼것도 없음.
                }
                alphabet[word.charAt(j) - 97] = true;
                // 현재알파벳이 다음알파벳이랑 다른데 이전에 나온적 없거나, 다음알파벳이랑 같은 경우 현재알파벳 true 체크
            }
        }
        System.out.println(count);

        /* 런타임 에러 - StringIndexOutOfBounds
        int group = 0;
        boolean check = true;

        // 한 알파벳이 붙어있지 않고 떨어져있으면 그룹단어가 아님
        // 한 알파벳이 연속된것과 떨어져있는건 어떻게 구분하지?
        // 지금 나온 알파벳이 이전과 다른지, 다르다면 처음 등장한건지 구분

        loop1:
        for (int i = 0; i < n; i++) {
            String word = reader.readLine();

            if (word.length() == 1) {
                count++;
            } else {
                for (int j = 1; j < word.length(); j++) {
                    if(word.charAt(j) != word.charAt(j-1)){
                        if(word.substring(0,j).contains(String.valueOf(word.charAt(j)))){
                            // X-현재문자가 앞문자와 다르고 이전에 나온적이 있는 경우
                            group = 0;
                            check = false;
                            continue loop1;
                        } else {
                            // O-현재문자가 앞문자와 다르고 이전에 나온적없는 경우
                            group = 0;
                            check = true;
                        }
                    } else {
                        group++;
                        // X-현재문자가 앞문자와 동일한데 이전에 나온적 있는 경우 aahpaaa
                        if (word.substring(0, (j - group)).contains(String.valueOf(word.charAt(j)))) {
                            group =0;
                            check = false;
                            continue loop1;
                        } else {
                            // O-현재문자가 앞문자와 동일하고 이전에 떨어져 나온적 없지만 3개 이상 붙어있는경우 ccazzz
                            check = true;
                        }
                    } // 현재문자가 앞문자와 동일한 경우
                } // for
                if (check == true) {
                    count++;
                }
            }
        }
        System.out.println(count);*/

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

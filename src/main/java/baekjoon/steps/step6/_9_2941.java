package baekjoon.steps.step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _9_2941 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word = reader.readLine();
        String[] check = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (int i = 0; i < check.length; i++) {
            if (word.contains(check[i])) {
                word = word.replace(check[i], "0");
            }
        }
        System.out.println(word.length());

        /*
        String[] check = {"c=", "c-", "lj", "nj", "s=", "z="};
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            char nowC = word.charAt(i);
            if (nowC == 'c' || nowC == 'd' || nowC == 'l' || nowC == 'n' || nowC == 's' || nowC == 'z' && i != word.length()-1) {
                String nowS = String.valueOf(word.charAt(i)) + String.valueOf(word.charAt(i+1));
                for (int j = 0; j < check.length; j++) {
                    if (nowS.equals(check[j])) {
                        count ++;
                        System.out.println(word.charAt(i));
                        i++;
                        break;
                    } else {
                        count++;
                        System.out.println(word.charAt(i));
                        break;
                    }
                } // for - check
            } // if
            else if (nowC == 'd'){
                if (i < word.length() - 1 && word.charAt(i + 1) == '-') {
                    count++;
                    System.out.println(word.charAt(i));
                    i++;
                } else if (i < word.length() - 2 && word.charAt(i + 1) == 'z' && word.charAt(i + 2) == '=') {
                    count++;
                    System.out.println(word.charAt(i));
                    i += 2;
                } else {
                    count++;
                    System.out.println(word.charAt(i));
                }
            } else {
                count++;
                System.out.println(word.charAt(i));
            }
        } // for*/

/*
        for (int i = 0; i < word.length(); i++) {
//            String s = "";
//            char now = word.charAt(i);
//            if (now == 'c' || now == 'd' || ) {
//                s = String.valueOf(word.charAt(i)) + String.valueOf(word.charAt(i + 1));
//            }
            if (i != (word.length()-1)){
                switch (word.charAt(i)) {
                    case 'c':
                        if(word.charAt(i+1) == '=' || word.charAt(i+1) == '-'){
                            count ++;
                            i++;
                        }
                        break;
                    case 'l':
                        if (word.charAt(i + 1) == 'j') {
                            count++;
                            i++;
                            break;
                        }
                        break;
                    case 'n':
                        if (word.charAt(i + 1) == 'j') {
                            count++;
                            i++;
                        }
                        break;
                    case 's':
                        if (word.charAt(i + 1) == '=') {
                            count++;
                            i++;
                        }
                        break;
                    case 'z':
                        if (word.charAt(i + 1) == '=') {
                            count++;
                            i++;
                        }
                        break;
                    case 'd':
                        if (word.charAt(i + 1) == '-') {
                            count++;
                            i++;
                        } else if (word.charAt(i + 1) == 'z' && word.charAt(i + 2) == '=') {
                            count += 2;
                            i += 2;
                        }
                        break;
                } // ..switch
            } // ..if
            else {
                count++;
                System.out.println(word.charAt(i));
            }

        } // ..for*/

//        System.out.println(count);
    }
}

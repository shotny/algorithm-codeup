package baekjoon.steps.step5;

import java.io.*;

public class _3_1065_1 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));



/*
        String stringN = reader.readLine();
        int n = Integer.parseInt(stringN);
        int count = 99;
        int gap;

        if (n < 100) {
            System.out.println(n);
//            writer.write(n);
        } else {
            for (int j = 111; j <= n; j++) {

                gap = Character.getNumericValue(stringN.charAt(1)) - Character.getNumericValue(stringN.charAt(0));
                String checkNum = String.valueOf(j);

                if (Character.getNumericValue(stringN.charAt(0)) < Character.getNumericValue(stringN.charAt(1)) ) {
                    for (int i=1; i<(checkNum.length()-1); i++){
                        if ((Character.getNumericValue(checkNum.charAt(i)) + gap) != Character.getNumericValue(checkNum.charAt(i+1))) {
                            break;
                        }
                        if (i == 2) {
                            System.out.println(j);
                            count = count + 1;
                        }
                    }
                } else {
                    for (int i=1; i<(checkNum.length()-1); i++){
                        if ((Character.getNumericValue(checkNum.charAt(i)) - gap) != Character.getNumericValue(checkNum.charAt(i+1))) {
                            break;
                        }
                        if (i == 2) {
                            System.out.println(j);
                            count = count + 1;
                        }
                    }
                }

            }
            System.out.println(count);
//            writer.write(count);
        }
//        writer.flush();
//        reader.close();
//        writer.close();
    */
    }
}

// n <= 99이면 한수의 개수는 n
// n > 99 이면 등차수열인지 체크해야됨 -> 일정하게 증가할 경우 / 일정하게 감소할 경우 / 모든 자리수가 같을 경우
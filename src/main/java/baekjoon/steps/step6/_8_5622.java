package baekjoon.steps.step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _8_5622 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word = reader.readLine();
        int time = 0;

        for (int i = 0; i < word.length(); i++) {
            int number = (int) word.charAt(i);

            if (number >= 87) {  // w,x,y,z ..9
                time += 10;
            } else if (number >= 84) { // ..8
                time += 9;
            } else if(number >= 80){ //..7
                time += 8;
            }else if(number >= 77){ //..6
                time += 7;
            }else if(number >= 74){ //..5
                time += 6;
            }else if(number >= 71){ //..4
                time += 5;
            }else if(number >= 68){ //..3
                time += 4;
            }else { //..2
                time += 3;
            }
        }
        System.out.println(time);
    }
}

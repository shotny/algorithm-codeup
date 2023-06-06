package inf_kim.section4_HashMap_TreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        mySol(s);
        infSol(s);
    }

    static void mySol(String s) {
        int[] result = new int[5];
        for (Character x : s.toCharArray()) {
            switch (x) {
                case 'A': result[0]+=1;
                          break;
                case 'B': result[1]+=1;
                          break;
                case 'C': result[2]+=1;
                          break;
                case 'D': result[3]+=1;
                          break;
                default:  result[4]+=1;
                          break;
            }
        }
        char answer = 0;
        int max = 0;
        for (int i=0; i<result.length; i++) {
            if (result[i]  > max) {
                max = result[i];
                answer = (char) (65 + i);
            }
        }
        System.out.println(answer);
    }

    static void infSol(String s){
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for(Character x : s.toCharArray()){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        for(char key : map.keySet()){
            if(map.get(key) > max){
                max = map.get(key);
                answer = key;
            }
        }
        System.out.println(answer);
    }
}
//public static void main(String[] args) {
//
//    }
//    static void mySol(){}
//    static void infSol(){}

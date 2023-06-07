package inf_kim.section4_HashMap_TreeSet;

import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        mySol(a, b);
        System.out.println(infSol(a, b));
    }
    static void mySol(String wordA, String wordB){
        HashMap<Character, Integer> mapA = new HashMap<>();
        HashMap<Character, Integer> mapB = new HashMap<>();
        boolean isAnagram = true;
        for (Character x : wordA.toCharArray()) {
            mapA.put(x, mapA.getOrDefault(x, 0)+1);
        }
        for (Character x : wordB.toCharArray()) {
            mapB.put(x, mapB.getOrDefault(x, 0)+1);
        }
        for (Character x : mapA.keySet()){
            if (mapA.get(x) != mapB.getOrDefault(x, 0)) {
                isAnagram = false;
            }
        }
        if(isAnagram){
            System.out.println("YES");
        } else {
            System.out.println("NO");}
    }

    static String infSol(String s1, String s2) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character x : s1.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        for (Character x : s2.toCharArray()) {
            if(!map.containsKey(x) || map.get(x) == 0){return "NO";}
            map.put(x, map.get(x) - 1);
        }
        return answer;
    }
}
// Anagram: 두 문자열이 알파벳의 나열 순서를 다르지만 그 구성이 일치하면 두 단어는 아나그램
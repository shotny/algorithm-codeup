package inf_kim.section4_HashMap_TreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        System.out.println(mySol(s,t));
    }

    static int infSol(String s, String t){
        int answer = 0;
        HashMap<Character, Integer> smap = new HashMap<>();
        HashMap<Character, Integer> tmap = new HashMap<>();

        for(Character x : t.toCharArray()){tmap.put(x, tmap.getOrDefault(x, 0)+1);}
        for(int i=0; i<t.length()-1; i++){smap.put(s.charAt(i), smap.getOrDefault(s.charAt(i), 0)+1);}

        int lt = 0;
        for(int i=t.length()-1; i<s.length(); i++){
            smap.put(s.charAt(i), smap.getOrDefault(s.charAt(i), 0)+1);
            if(smap.equals(tmap)){answer++;}
            smap.put(s.charAt(lt), smap.get(s.charAt(lt))-1);
            if(smap.get(s.charAt(lt))==0){smap.remove(s.charAt(lt));}
            lt++;
        }
        return answer;
    }

    static int mySol(String s, String t){
        int answer = 0;
        HashMap<Character, Integer> smap = new HashMap<>();
        HashMap<Character, Integer> tmap = new HashMap<>();
        char[] arr = s.toCharArray();
        for (Character c : t.toCharArray()){
            tmap.put(c, tmap.getOrDefault(c, 0)+1);
        }
        for(int i=0; i<t.length()-1; i++){
            smap.put(arr[i], smap.getOrDefault(arr[i], 0)+1);
        }
        int lt=0;
        for(int i=t.length()-1; i<arr.length; i++){
            smap.put(arr[i], smap.getOrDefault(arr[i], 0)+1);
            boolean isAnagram = true;
            for (Character x : tmap.keySet()) {
                if(smap.getOrDefault(x, 0) != tmap.get(x)){isAnagram = false;}
            }
            if(isAnagram){answer++;}
            smap.put(arr[lt], smap.get(arr[lt])-1);
            lt++;
        }
        return answer;
    }
}

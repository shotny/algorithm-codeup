package inf_kim.section4_HashMap_TreeSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for(int x : infSol(n,k,arr)){System.out.print(x+" ");}
    }

    static ArrayList<Integer> infSol(int n, int k, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<k-1; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        int lt=0;
        for(int rt=k-1; rt<n; rt++){
            map.put(arr[rt], map.getOrDefault(arr[rt], 0)+1);
            answer.add(map.size());
            map.put(arr[lt], map.get(arr[lt])-1);
            if(map.get(arr[lt]) == 0){map.remove(arr[lt]);}
            lt++;
        }
        return answer;
    }

    // Time Limit Exceeded _ answer를 int[]에서 ArrayList<>로 바꾸니 시간제한 안 넘김
    static ArrayList<Integer> mySol2(int k, int[] arr){
//        int[] answer = new int[arr.length - k + 1];
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<k; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        int lt = 0;
//        answer[0]=map.size();
        answer.add(map.size());
        for (int i = k; i<arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            map.put(arr[lt], map.get(arr[lt]) - 1);
            if(map.get(arr[lt]) == 0){map.remove(arr[lt]);}
            lt++;
            answer.add(map.size());
        }

        return answer;
    }


    // Time Limit Exceeded
    static int[] mySol1(int k, int[] arr){
        int[] answer = new int[arr.length - k + 1];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i+k-1 < arr.length; i++) {
            for(int j=i; j<i+k; j++){
                map.put(arr[j], map.getOrDefault(arr[j], 0)+1);
            }
            answer[i] = map.size();
            map.clear();
        }
        return answer;
    }
}
// N일 동안의 매출기록을 주고 연속된 K일 동안의 매출액의 종류를 구하라
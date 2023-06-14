package inf_kim.section4_HashMap_TreeSet;

import java.util.*;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];  // 카드
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(infSol(n, k, arr));
    }

    static int infSol(int n, int k, int[] arr){
        int answer = -1, count = 0;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int l=j+1; l<n; l++){
                    Tset.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }
        for(int x : Tset){
            count++;
            if(count == k){ return x;}
        }
        return answer;
    }

    static int mySol(int n, int k, int[] arr){
        Arrays.sort(arr);
        int max = arr[n-1]+arr[n-2]+arr[n-3];
        int answer = 0, count = 1;

        System.out.println();
        for(int x :arr){
            System.out.print(x+" ");
        }
        System.out.println();

        for (int i = arr.length - 3; i >= 0; i--) {
            int tmp = arr[n-1]+arr[n-2]+arr[i];
            if(tmp < max){
                count++;
                max = tmp;
            }
            if(count == k){
                System.out.println("arr[i]: "+arr[i]+" count: "+count);
                answer = max;
                break;
            }
        }
        return answer;
    }
}
// 기록한 카드에서 3장을 뽑아 k번째로 큰 수 출

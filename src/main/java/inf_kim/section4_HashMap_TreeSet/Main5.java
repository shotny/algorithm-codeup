package inf_kim.section4_HashMap_TreeSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];  // 카드
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(mySol(n, k, arr));
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

        for (int i = arr.length - 4; i >= 0; i--) {
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

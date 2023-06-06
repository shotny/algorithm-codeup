package inf_kim.section3_TowPointers_SlidingWindow;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(mySol(k, arr));
        System.out.println(infSol(k, arr));
    }

    public static int infSol(int k, int[] arr) {
        int answer = 0, cnt = 0, lt = 0;
        for (int rt = 0; rt < arr.length; rt++) {
            if(arr[rt] == 0){cnt++;}
            while (cnt > k) {
                if(arr[lt] == 0){cnt--;}
                lt++;
            }
            answer = Math.max(answer, rt - lt + 1);
        }
        return answer;
    }

    // 틀림
    static int mySol(int k, int[] arr) {
        int l = 0, r = 0, answer = 0, rtmp = 0, ltmp=0;

        while (r<arr.length){
            if(arr[r]==0){k--;}
            if(k>=0){
                answer++;
                r++;
            }
            if(k<0){
                r++;
                while (r<arr.length && arr[r]==1){rtmp += arr[r++];}
                while (arr[l]==1){ltmp += arr[l++];}
                if(rtmp >= ltmp){
                    answer = answer + 1 + rtmp - ltmp;
                    rtmp = 0;
                    ltmp = 0;
                    while (arr[l] == 0){
                        k++;
                        answer--;
                        l++;
                    }
                }
            }
        }
        return answer ;
    }
}
// 1의 합 answer, 변경가능 횟수 K
// 1이면 r을 증가시키면서 answer++,
// k>0이면 k--후 r 증가시키면서 answer++,
// k==0이면 && 이후 값 >= l이 읽는 0이전 값의 합
//         -> l인덱스 증가하면서 그 값만큼 감소 후 0에서 k++, k--후 r증가한 값만큼 answer++
//


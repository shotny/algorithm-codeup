package inf_kim.section5_Stack_Queue;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        Queue<Integer> q = new LinkedList<>();
        for (int i=1; i<=n; i++){ q.offer(i); }
        System.out.println(infSol(k, q));


        HashMap<Integer, Integer> prince = new HashMap<>(n);
        for(int i=1; i<=n; i++){
            if(i==n){
                prince.put(i, 1);
            } else prince.put(i, i+1);
        }
    }

    //Queue 사용
    static int infSol(int k, Queue<Integer> q){
        int answer = 0;
        while (!q.isEmpty()){
            for(int i=1; i<k; i++) q.offer(q.poll());
            q.poll();
            if(q.size() == 1) answer = q.poll();
        }
        return answer;

        /*
        while (q.size() > 1){
            int count = 0;
            while (count != k){
                count++;
                if(count == k){
                    q.poll();
                } else q.offer(q.poll());
            }
        }
        return q.poll();
        */
    }

    static int mySol(HashMap<Integer, Integer> prince, int k){
        int pre = 1;
        int now = 1;
        int count = 1;
        int answer = 0;
        Loop1:
        while (prince.size() > 1){
            count++;
            now = prince.get(pre);
            if(count == k) {
                prince.replace(pre, prince.get(now));
                if(prince.size() == 2){
                    answer = prince.get(now);
                    //break Loop1;
                }
                prince.remove(now);

            } else pre = now;
        }
        return answer;
    }
}
// 1~n까지 둥글게 앉았을 때 순서대로 1씩 말한다.
// k 말한 사람 탈락. 그 이후 사람부터 다시 1부터 말하고 마지막에 남은 번호 리턴

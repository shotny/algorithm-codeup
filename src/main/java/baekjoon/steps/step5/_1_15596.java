package baekjoon.steps.step5;

public class _1_15596 {
    long sum(int[] a){
        long ans = 0;

        for (int i=0; i<a.length; i++){
            ans += a[i];
        }

        for (long e : a) {
            ans+=e;
        }
        return ans;
    }
}

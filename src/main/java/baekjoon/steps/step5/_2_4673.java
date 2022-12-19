package baekjoon.steps.step5;

public class _2_4673 {
    static int d(int n) {
        int result = n;

        while (n != 0) {
            result += n % 10;
            n= n / 10;
        }
        return result;
    } // 계산 함수

    public static void main(String[] args) {
        int[] check = new int[10001];

        for(int i = 1; i <= 10000; i++) {
            if (d(i) <= 10000) {
                check[d(i)] = 1;
            }
        }

        for(int i = 1; i <= 10000; i++) {
            if (check[i] == 0) {
                System.out.println(i);
            }
        }
    }
}

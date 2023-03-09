package baekjoon.steps.step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 바구니 순서 바꾸기 문제
* 여러 바구니 중 일부분을 begin, mid, end 로 지정한다
* 바꿀 순서는 mid ~ end, begin ~ (mid-1)이다.
* 위 행위는 m 번 반복된다.
* */
public class _4_10812 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = reader.readLine().split(" ");

        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        int[] result = new int[n + 1];
        for (int i = 1; i < (n + 1); i++) {
            result[i] = i;
        }
        int[] temp = Arrays.copyOf(result, result.length);

        for (int i = 1; i <= m; i++) {
            String[] range = reader.readLine().split(" ");
            int begin = Integer.parseInt(range[0]);
            int end = Integer.parseInt(range[1]);
            int mid = Integer.parseInt(range[2]);

            int fromMid = mid;
            for (int j = begin; j <= end; j++) {
                if (j <= (begin + end - mid)) {
                    result[j] = temp[fromMid];
                    ++fromMid;
                } else {
                    result[j] = temp[begin];
                    ++begin;
                }
            }

            for (int k = 1; k < result.length; k++) {
                temp[k] = result[k];
            }
        }

        for (int k = 1; k < result.length; k++) {
            System.out.print(result[k] + " ");
        }
    }
}

/* 첫 줄에 n, m 그 다음 줄부터 m번 (begin, end, mid)가 입력된다.
* 크기가 n+1 인 배열을 두 개 만든다. 기존값을 담고있을 배열 temp, 결과물로 저장될 배열  result
* mid ~ end를 result의 result 배열의 begin부터 값을 재할당한다.
* end번째가 되면 begin 에서 시작해 mid-1까지의 값을 result 배열에 마저 할당한다.
* */

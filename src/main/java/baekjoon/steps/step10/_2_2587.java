package baekjoon.steps.step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _2_2587 {
    public static void main(String[] args)throws IOException {
        int sum = 0;
        int[] arr = new int[5];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
            sum += arr[i];
        }
        Arrays.sort(arr);

        /* 방법1
        for (int i = 0; i < 5; i++) {
            int n = Integer.parseInt(reader.readLine());
            sum += n;

            if (i == 0) {
                arr[i] = n;
                continue;
            }

            for (int j = 0; j < i; j++) {
                if (n < arr[j]) {
                    for (int k = i; k > j; k--) {
                        arr[k] = arr[k-1];
                    }
                    arr[j] = n;
                    break;
                }
            }
            if (arr[i] == 0) {
                arr[i] = n;
            }
        }*/

        reader.close();
        System.out.println(sum / 5);
        System.out.println(arr[2]);
    }
}

/*다섯 개의 자연수가 주어질 때 이들의 평균과 중앙값을 구하는 프로그램
* 평균을 구하기 위해 주어진값의 합을 저장할 변수 sum을 선언한다.
* 크키가 5인 배열 arr을 선언한다.
* 값이 주어지면 sum에 더해 저장하고, arr에 저장한다.
* -> 주어진 값과 저장된 값을 비교해 주어진값이 저장된값보다 작으면
*    저장된값의 위치에 저장하고 저장된 값은 주어진 값 이후로 저장한다.
* */

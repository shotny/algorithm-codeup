package baekjoon.steps.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _4_2563 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[][] area = new int[100][100];
        int x, y = 0;
        int total = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            for (int j = x; j < (x + 10); j++) {
                for (int k = y; k < (y + 10); k++) {
                    if (area[j][k] != 1) {
                        ++total;
                        area[j][k] = 1;
                    }
                }
            }
        }
        reader.close();
        System.out.println(total);

        /* 기각...
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[][] coordinates = new int[n][2];
        int area = n * 100;
        int gapX, gapY = 0;
        int preX, preY = 0;
        int nowX, nowY = 0;

        String[] first = reader.readLine().split(" ");
        coordinates[0][0] = Integer.parseInt(first[0]);
        coordinates[0][1] = Integer.parseInt(first[1]);

        for (int i = 1; i < n; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
            nowX = coordinates[i][0] = Integer.parseInt(st.nextToken());
            nowY = coordinates[i][1] = Integer.parseInt(st.nextToken());

            for (int j = 0; j < i; j++) {
                preX = coordinates[j][0];
                preY = coordinates[j][1];

                gapX = nowX - preX;
                gapY = nowY - preY;

                if (gapX < 0) {
                    gapX = Math.abs(gapX);
                }
                if (gapY < 0) {
                    gapY = Math.abs(gapY);
                }

                if (gapX < 10 && gapY <10) {
                    area -= (10 - gapX) * (10 - gapY);
                }
            }
        }
        reader.close();
        System.out.println(area);*/
    }
}

/* 기각 ㅜ
 주어지는 두 수를 색종이의 왼쪽 아래 꼭짓점이 위치한 x, y 좌표라고 할 때
 각 색종이의 x좌표나 y좌표 중 하나라도 10이상 차이가 나면 색종이는 겹치지 않는다.
 주어진 좌표를 기억하고 있다가 새롭게 주어진 좌표가 이전에 주어진 좌표중 10이상 차이 나지 않는게 있는지 체크한다.
 10미만으로 차이나는 좌표가 있다면 각 좌표의 차만큼을 구하고 10에서 x좌표의 차를 뺀 값과 10에서 y좌표의 차를 뺀 값을 곱해 전체 면적에서 제한다.

 주어진 색종이 수 = n
 - 겹치는 부분을 고려하지 않은 검정색 종이의 총 면적은 n*100
 - 크기가 n인 배열 생성
 [반복문 1] (n-1)만큼 색종이 좌표 받기 반복
  -> 좌표 받아서 배열에 좌표값 저장.
  -> [반복문 2] (조건-첫 번째 색종이가 아니면) 배열의 0부터 i-1 번째까지 색종이의 좌표 중 차가 10이상 나지 않는게 있는지 체크
      -> 있다면 10에서 x좌표의 차를 뺀 값과 10에서 y좌표의 차를 뺀 값을 곱해 전체 면적에서 제한다.*/

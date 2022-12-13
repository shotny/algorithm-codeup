package baekjoon.steps.step2;

import java.util.Scanner;

public class _6_2525 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startH = scanner.nextInt();
        int startM = scanner.nextInt();
        int cookingTime = scanner.nextInt();

        int finishH;
        int finishM;

        if (startM + cookingTime < 60) {
            finishM = startM + cookingTime;
            System.out.printf("%d %d",startH,finishM);
        } else {
            finishM = (startM + cookingTime) % 60;
            finishH = startH + (startM + cookingTime) / 60;
            if (finishH >= 24) {
                System.out.printf("%d %d", finishH-24, finishM);
            } else {
                System.out.printf("%d %d", finishH, finishM);
            }
        }

    }
}

package baekjoon.steps.step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class _10_25206 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double totalSum = 0;
        double creditSum = 0;
        Map<String, Double> gradeList = Map.of("A+", 4.5,
                                                "A0", 4.0,
                                                "B+", 3.5,
                                                "B0", 3.0,
                                                "C+", 2.5,
                                                "C0", 2.0,
                                                "D+", 1.5,
                                                "D0", 1.0,
                                                "F", 0.0);

        for (int i = 1; i <= 20; i++) {
            String[] each = reader.readLine().split(" ");
            if (each[2].equals("P")) {
                continue;
            }

            double thisCredit = Double.parseDouble(each[1]);
            totalSum += gradeList.get(each[2]) * thisCredit;
            creditSum += thisCredit;
        }
        System.out.printf("%.6f", totalSum/creditSum);

/*        Loop1:
        for (int i = 1; i <= 20; i++) {
            String[] each = reader.readLine().split(" ");
            double thisCredit = each[1].charAt(0) - 0;

            //과목평점
            switch (each[2]) {
                case "A+":
                    grade = 4.5;
                    break;
                case "A0":
                    grade = 4;
                    break;
                case "B+":
                    grade = 3.5;
                    break;
                case "B0":
                    grade = 3;
                    break;
                case "C+":
                    grade = 2.5;
                    break;
                case "C0":
                    grade = 2;
                    break;
                case "D+":
                    grade = 1.5;
                    break;
                case "D0":
                    grade = 1;
                    break;
                case "P":
                    continue Loop1;
                default:
                    grade = 0;
                    break;
            }
            sum += (thisCredit * grade);
            credit += thisCredit;
            System.out.printf("%d번째까지의 전공평점은 %.6f \n", i, sum/credit);
        }
        System.out.printf("%.6f", sum/credit);*/
    }
}

/*20줄에 걸쳐 치훈이가 수강한 전공과목의 과목명, 학점, 등급이 공백으로 구분되어 주어진다.
* 전공평점 = 전공과목별(학점 × 성적)의 합 / 학점의 총합(P인 과목은 계산에서 제외)
*
* 성적 저장한 변수 grade, (학점 x 성적)의 총합을 저장할 변수 sum, 학점의 총합을 계산할 변수 credit
* 조건문 - readLine.split(" ")[2]가 p가 아닐 때 / 학점 계산
* */

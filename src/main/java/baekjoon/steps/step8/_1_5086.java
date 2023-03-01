package baekjoon.steps.step8;

import java.io.*;

// 첫 번째 숫자가 두 번째 숫자의 약수라면 factor를, 배수라면 multiple을, 둘 다 아니라면 neither
// n1이 n2보다 큰가? 작은수로 큰 수를 나눴을 때 나머지가 0인가? 를 체크
public class _1_5086 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String firstCase = reader.readLine();
        int num1 = Integer.parseInt(firstCase.split(" ")[0]);
        int num2 = Integer.parseInt(firstCase.split(" ")[1]);

        while (num1 != 0 && num2 != 0){
            writer.write(getRelation(num1, num2) + "\n");

            String newCase = reader.readLine();
            num1 = Integer.parseInt(newCase.split(" ")[0]);
            num2 = Integer.parseInt(newCase.split(" ")[1]);
        }

        reader.close();
        writer.flush();
        writer.close();
    }

    private static String getRelation(int num1, int num2) {
        if ((num1 > num2) && (num1 % num2 == 0)) {
            return "multiple";
        } else if ((num1 < num2) && (num2 % num1 == 0)) {
            return "factor";
        } else {
            return "neither";
        }
    }
}

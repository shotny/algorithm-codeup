package inf_kim.section1_String;

import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder number = new StringBuilder();

        for (char c : str.toCharArray()){
            if (!Character.isAlphabetic(c)) {
                number.append(c);
            }
        }
        System.out.println(Integer.parseInt(number.toString()));
    }
}

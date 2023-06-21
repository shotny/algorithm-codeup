package inf_kim.section5_Stack_Queue;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(mySol(str));
    }
    static String mySol(String str){
        boolean in = false;
        int cnt = 0;
        StringBuilder answer = new StringBuilder();
        for (char x : str.toCharArray()){
            if (x == '('){
                in = true;
                cnt++;
                continue;}
            if(x == ')'){
                in = false;
                cnt--;
                continue;}
            if(!in && cnt == 0){
                answer.append(x);
            }
        }
        return  answer.toString();
    }
}

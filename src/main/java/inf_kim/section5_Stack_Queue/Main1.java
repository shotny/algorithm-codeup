package inf_kim.section5_Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] arr = s.toCharArray();
        System.out.println(mySol(arr));
    }
    static String mySol(char[] arr){
        Stack<Character> stack = new Stack<>();
        for(Character c : arr){
            if(c.equals('(')){stack.push('(');}
            if(c.equals(')')){
                if(stack.empty()){return "NO";}
                stack.pop();}
        }
        if(stack.empty()){
            return "YES";
        } return "NO";
    }

    static String infSol(String str){
        String answer = "YSE";
        Stack<Character> stack = new Stack<>();
        for(char x : str.toCharArray()){
            if(x == '(') stack.push(x);
            else {
                if(stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        if(!stack.isEmpty()){ return "NO";}
        return answer;
    }
}
// 입력된 괄호가 올바르면 YES, 올바르지 않으면 NO 출력
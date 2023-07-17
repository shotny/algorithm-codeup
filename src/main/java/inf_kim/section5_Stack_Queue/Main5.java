package inf_kim.section5_Stack_Queue;

import javax.xml.stream.events.Characters;
import java.util.Scanner;
import java.util.Stack;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(mySol(s));
    }
    static int mySol(String s){
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character x = s.toCharArray()[i];
            if(x.equals('(')){
                stack.push(x);
            } else {
                stack.pop();
                if(s.toCharArray()[i - 1] == '('){
                    answer += stack.size();
                } else {
                    answer += 1;
                }
            }
        }
        return answer;
    }

    static int infSol(String str){
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='(') stack.push('(');
            else{
                stack.pop();
                if(str.charAt(i-1) == '(') answer += stack.size();
                else answer++;
            }
        }
        return answer;
    }
}
// 쇠막대기와 레이저의 배치를 나타내는 괄호 표현이 주어졌을 때, 잘려진 쇠막대기 조각의 총 개수를 구하는 프로그램을 작성

// 괄호 사이에 붙어있는 괄호가 몇개인지 체크
// 레이저가 쇠막대기 위에 있는지 체크


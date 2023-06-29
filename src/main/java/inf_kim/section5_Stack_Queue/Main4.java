package inf_kim.section5_Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(mySol(scanner.nextLine()));
    }
    static int mySol(String str){
        Stack<Integer> stack = new Stack<>();

        for (char c : str.toCharArray()){
            if(Character.isDigit(c)){
                stack.push(c-48);
            } else {
                int rt = stack.pop();
                int lt = stack.pop();
                if( c == '+'){stack.push(lt+rt);}
                if( c == '-'){stack.push(lt-rt);}
                if( c == '*'){stack.push(lt*rt);}
                if( c == '/'){stack.push(lt/rt);}
            }
        }
        return stack.pop();
    }
}
// 후위식 연산이 주어지면 결과 출력
// 문자로 주어지는 연산자를 하나씩 다 캐치해서 변환해야하나? yes..

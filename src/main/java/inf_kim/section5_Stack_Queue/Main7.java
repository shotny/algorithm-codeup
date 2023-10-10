package inf_kim.section5_Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String primary = scanner.nextLine();
        String plan = scanner.nextLine();

        Stack stack = new Stack<>();
        for(int i=primary.length()-1; i>=0; i--){
            stack.push(primary.charAt(i));
        }

        boolean answer = true;
        for (int i = 0; i < plan.length(); i++) {
            Character now = plan.charAt(i);
            if (!stack.contains(now)) {
                answer = true;
            } else {
                if (stack.peek().equals(now)) {
                    answer = true;
                    stack.pop();
                } else {
                    answer = false;
                }
            }
            if (!answer) {
                break;
            }
        }
        if(!stack.isEmpty()){
            answer = false;
        }

        if(answer){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

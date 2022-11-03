package codeup100;

import java.util.Scanner;

public class CodeupBasic {

    public static void basic1001(){
        System.out.println("Hello");
    }
    public static void basic1002() { System.out.println("Hello World"); }
    public static void basic1003() { System.out.println("Hello\nWorld"); }
    public static void basic1004() { System.out.println("\'Hello\'"); }
    public static void basic1005() { System.out.println("\"Hello World\""); }
    public static void basic1006() { System.out.printf("\"!@#$%%^&*()\"%n"); }
    public static void basic1007() { System.out.println("\"C:\\Download\\hello.cpp\""); }
    public static void basic1008() {
//        System.out.printf("%c%c%c%n%c%c%c%n%c%c%c", '\u250C', '\u252C','\u2510','\u251C','\u253C','\u2524','\u2514', '\u2534','\u2518');
        System.out.printf("\u250C\u252C\u2510%n\u251C\u253C\u2524%n\u2514\u2534\u2518");
        System.out.printf("%n");
    }
    public static void basic1010() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(n);

        // 제출시 Scanner import 안해주면 컴파일 에러 발생
    }

    public static void test(){
        basic1001();
        basic1002();
        basic1003();
        basic1004();
        basic1005();
        basic1006();
        basic1007();
        basic1008();
        basic1010();
    }


/*
CodeUp 제출 형식

public class Main{
    public static void main(String[] args){
	}
}
*/

}

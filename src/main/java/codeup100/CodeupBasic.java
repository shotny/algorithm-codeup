package codeup100;

import java.util.Scanner;

/*
CodeUp 제출 형식

public class Main{
    public static void main(String[] args){
	}
}
*/

public class CodeupBasic {

    public static void test(){
//        basic1001();
//        basic1002();
//        basic1003();
//        basic1004();
//        basic1005();
//        basic1006();
//        basic1007();
//        basic1008();
//        basic1010();

//        basic1011();
//        basic1012();
//        basic1013();
//        basic1014();
//        basic1015();
//        basic1017();
//        basic1018();
//        basic1019();
//        basic1020();
    }


    // 11. 8. 1011~1020
    public static void basic1011() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        while (input.length() >= 2) {
            System.out.println("한 글자만 입력해주세요");
            input = scanner.next();
        }

        char printOut = input.charAt(0);
        System.out.println(printOut);
    }

    public static void basic1012(){
        Scanner floatScanner = new Scanner(System.in);
        float f = floatScanner.nextFloat();
        System.out.printf("%f%n", f);
    }

    public static void basic1013() {
        Scanner scanner = new Scanner(System.in);
        int i1 = scanner.nextInt();
        int i2 = scanner.nextInt();
        System.out.printf("%d %d%n", i1, i2);
    }

    public static void basic1014() {
        Scanner scanner = new Scanner(System.in);
        char c1 = scanner.next().charAt(0);
        char c2 = scanner.next().charAt(0);
        System.out.printf("%c %c", c2, c1);
    }

    public static void basic1015() {
        Scanner scanner = new Scanner(System.in);
        float f = scanner.nextFloat();
        System.out.printf("%.2f", f);
    }

    public static void basic1017() {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.printf("%d %d %d", i,i,i);
    }

    public static void basic1018() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String s1 = s.split(":")[0];
        String s2 = s.split(":")[1];
//        System.out.println(s);
        System.out.printf("%s:%s%n", s1, s2);
    }

    public static void basic1019() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int year = Integer.parseInt(str.split("\\.")[0]);
        int month = Integer.parseInt(str.split("\\.")[1]);
        int day = Integer.parseInt(str.split("\\.")[2]);

        System.out.printf("%04d.%02d.%02d", year, month, day);
    }

    public static void basic1020() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int i1 = Integer.parseInt(str.split("-")[0]);
        int i2 = Integer.parseInt(str.split("-")[1]);

        System.out.printf("%06d%07d", i1, i2);
    }


    // 11. 3. 1001~1010
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

}

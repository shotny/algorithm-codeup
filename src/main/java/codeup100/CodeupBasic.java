package codeup100;

import java.util.Scanner;

/*
public class Main{
    public static void main(String[] args) {
    }
}
*/

public class CodeupBasic {

    public static void test() {
        {
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

//        basic1021();
//        basic1022();
//        basic1023();
//        basic1024();
//        basic1025();
//        basic1026();
//        basic1027();
//        basic1028();
//        basic1029();
//        basic1030();

//        basic1031();
//        basic1032();
//        basic1033();
//        basic1034();
//        basic1035();
//        basic1036();
//        basic1036();
//        basic1037();
//        basic1038();
//        basic1039();
//        basic1040();

//        basic1041();
//        basic1042();
//        basic1043();
//        basic1044();
//        basic1045();
//        basic1046();
//        basic1047();
//        basic1048();
//        basic1049();
//        basic1050();

//        basic1051();
//        basic1052();
//        basic1053();
//        basic1054();
//        basic1055();

//        basic1056();
//        basic1057();
//        basic1058();
//        basic1059();
//        basic1060();

//        basic1061();
//        basic1062();
//        basic1063();
//        basic1064();
//        basic1065();
//        basic1066();
//        basic1067();
//        basic1068();
//        basic1069();
//        basic1070();
//        basic1071();
//        basic1072();
//        basic1073();
//        basic1074();
//        basic1075();
//        basic1076();
//        basic1077();
//        basic1078();
//        basic1079();
//        basic1080();
        }
    }

//    11.17. 1061 ~ 1080
    public static void basic1061() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a|b);
    }
    public static void basic1062() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a^b);
    }

    //3항 연산자 사용하기
    public static void basic1063() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.printf("%d", a > b ? a : b);
    }
    public static void basic1064() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.printf("%d", (a<b ? a:b)<c? (a<b ? a:b):c);
    }
    public static void basic1065() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if(a%2 == 0){
            System.out.println(a);
        }
        if(b%2 == 0){
            System.out.println(b);
        }
        if(c%2 == 0){
            System.out.println(c);
        }
    }
    public static void basic1066() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if(a%2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        if(b%2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        if(c%2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
    public static void basic1067() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a > 0) {
            System.out.println("plus");
            if (a % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        } else {
            System.out.println("minus");
            if (a % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
    public static void basic1068() {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        if(score >= 90 & score <= 100){
            System.out.println("A");
        } else if (score >= 70) {
            System.out.println("B");
        } else if (score >= 40 ) {
            System.out.println("C");
        } else System.out.println("D");
    }
    public static void basic1069() {
        Scanner scanner = new Scanner(System.in);
        char grade = scanner.next().charAt(0);
        switch (grade) {
            case 'A' :
                System.out.println("best!!!");
                break;
            case 'B' :
                System.out.println("good!!");
                break;
            case 'C':
                System.out.println("run!");
                break;
            case 'D':
                System.out.println("slowly~");
                break;
            default:
                System.out.println("what?");
        }
    }
    public static void basic1070() {
        Scanner scanner = new Scanner(System.in);
        int season = scanner.nextInt();

        switch (season) {
            case 12: case 1: case 2:
                System.out.println("winter");
                break;
            case 3: case 4: case 5:
                System.out.println("spring");
                break;
            case 6: case 7: case 8:
                System.out.println("summer");
                break;
            default:
                System.out.println("fall");
        }
    }
    public static void basic1071() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int a = scanner.nextInt();
            if(a == 0){ break; }
            System.out.println(a);
        }
    }
    public static void basic1072() {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.println(scanner.nextInt());
        }
    }
    public static void basic1073() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int a = scanner.nextInt();
            if(a == 0){ break; }
            System.out.println(a);
        }
    }
    public static void basic1074() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        while (a>0){
            System.out.println(a);
            a -= 1;
        }
    }
    public static void basic1075() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        while (a != 0) {
            a -= 1;
            System.out.println(a);
        }
    }
    public static void basic1076() {
        Scanner scanner = new Scanner(System.in);
        char alphabet = scanner.next().charAt(0);
        char a = 'a';

        while (a <= alphabet) {
            System.out.println(a);
            a += 1;
        }
    }
    public static void basic1077() {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int zero = 0;
        while (zero <= i) {
            System.out.println(zero);
            zero += 1;
        }
    }
    public static void basic1078() {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int one = 1;
        int sum = 0;
        while (one <= i) {
            if (one % 2 == 0) {
                sum = sum + one;
            }
            one+=1;
        }
        System.out.println(sum);
    }
    public static void basic1079() {
        Scanner scanner = new Scanner(System.in);

        while (true){
            char c = scanner.next().charAt(0);
            if (c == 'q') {
                System.out.println(c);
                break;
            }
            System.out.println(c);
        }
    }
    public static void basic1080() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int i = 0;
        int sum = 0;

        while (sum < number) {
            i++;
            sum += i;
        }
        System.out.println(i);
    }

    // 11. 16. 1056~1060
    public static void basic1056() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.printf("%d", a != b ? 1 : 0);
    }
    public static void basic1057() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.printf("%d", a == b ? 1 : 0);
    }
    public static void basic1058() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.printf("%d", a==0 && b==0 ? 1 : 0);
    }

    // 비트단위 연산
    public static void basic1059() {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println(~i);
    }
    public static void basic1060() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a&b);
    }

    // 11. 15. 1041~1055
    public static void basic1041() {
        Scanner scanner = new Scanner(System.in);
        int before = scanner.next().charAt(0);
        char after = (char)(before + 1);
        System.out.println(after);
    }
    public static void basic1042() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a/b);
    }
    public static void basic1043() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a%b);
    }
    public static void basic1044() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        long result = (long)a + 1;
        System.out.println(result);
    }
    public static void basic1045() {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        long b = scanner.nextInt();

        System.out.printf((a+b) + "\n" + (a-b) + "\n" + (a*b) + "\n" + (a/b) + "\n" + (a%b) + "\n" + "%.2f", (float)a/b);
    }
    public static void basic1046() {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        long b = scanner.nextInt();
        long c = scanner.nextInt();

        long sum = a + b + c;
        float average = sum/(float)3;
        System.out.printf("%d%n%.1f", sum, average);
    }

    // 비트시프트 연산
    public static void basic1047() {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        System.out.println(a<<1);
    }
    public static void basic1048() {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a<<b);
    }
    public static void basic1049() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.printf("%d", a > b ? 1 : 0);
    }
    public static void basic1050() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.printf("%d", a == b ? 1 : 0);
    }
    public static void basic1051() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.printf("%d", b >= a ? 1 : 0);
    }
    public static void basic1052() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.printf("%d", a != b ? 1 : 0);
    }
    public static void basic1053() {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        System.out.printf("%d", value == 1 ? 0 : 1);
    }
    public static void basic1054() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.printf("%d", (a == 1 && b == 1) ? 1 : 0);
    }
    public static void basic1055() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.printf("%d", a == 1 || b == 1 ? 1 : 0);
    }


    // 11. 14. 1031~1040
    public static void basic1031() {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.printf("%o", i);
    }
    public static void basic1032() {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.printf("%x", i);
    }
    public static void basic1033() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Integer.toHexString(scanner.nextInt()).toUpperCase());
    }
    public static void basic1034() {
        // 8진수 -> 10진수
        Scanner scanner = new Scanner(System.in);
        System.out.println(Integer.parseInt(scanner.nextLine(), 8));
    }
    public static void basic1035() {
        Scanner scanner = new Scanner(System.in);
        int i = Integer.parseInt(scanner.nextLine(), 16);
        System.out.println(Integer.toOctalString(i));
    }
    public static void basic1036() {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextLine().charAt(0);
        System.out.println(i);
    }
    public static void basic1037() {
        Scanner scanner = new Scanner(System.in);
        char c = (char)scanner.nextInt();
        System.out.println(c);
    }

    // int 계산시 결과값 오버플로우가 되지 않게 업캐스팅 해줘야함
    public static void basic1038() {
        Scanner scanner = new Scanner(System.in);
        String sc = scanner.nextLine();
        long response = (long) Integer.parseInt(sc.split(" ")[0]) + (long) Integer.parseInt(sc.split(" ")[1]);
        System.out.println(response);
    }
    public static void basic1039() {
        Scanner scanner = new Scanner(System.in);
        String sc = scanner.nextLine();
        long l = Long.parseLong(sc.split(" ")[0]) + Long.parseLong(sc.split(" ")[1]);
        System.out.println(l);
    }
    public static void basic1040() {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int changeSign = i < 0 ? -i : -i;
        System.out.println(changeSign);
    }


    // 11. 10. 1021~1030
    public static void basic1021(){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(str);
    }
    public static void basic1022(){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(str);
    }
    public static void basic1023(){
        Scanner scanner = new Scanner(System.in);
        String[] str = Float.toString(scanner.nextFloat()).split("\\.");
        System.out.println(str[0]+"\n"+str[1]);
    }
    public static void basic1024(){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            System.out.println("\'" + c + "\'");
        }
    }
    public static void basic1025(){
        Scanner scanner = new Scanner(System.in);
        String x = Integer.toString(scanner.nextInt());

        for(int i=x.length(); i > 0; i--){
            // x 자리수 (x-x)번째 수 * 10의 x승 부터 출력
            int y = x.charAt(x.length() - i) - '0';
            int n = (int)Math.pow(10, i-1);
            System.out.println("[" + y*n + "]");
        }
    }
    public static void basic1026() {
        Scanner scanner = new Scanner(System.in);
        String minute = scanner.next().split(":")[1];

        if (minute.charAt(0) == '0') {
            System.out.println(minute.charAt(1));
        } else System.out.println(minute);
    }
    public static void basic1027(){
        Scanner scanner = new Scanner(System.in);
        String[] date = scanner.next().split("\\.");
        System.out.printf("%02d-%02d-%04d", Integer.parseInt(date[2]), Integer.parseInt(date[1]), Integer.parseInt(date[0]));
    }
    public static void basic1028(){
        // int 범위: -2147483648 ~ 2147483647
        Scanner scanner = new Scanner(System.in);
        long l = scanner.nextLong();
        System.out.println(l);

//        if (l > 2147483647 ){
//            long x = l % 2147483647;
//            System.out.println(2147483647 + x);
//        } else System.out.println(l);
    }
    public static void basic1029(){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%.11f", scanner.nextDouble());
    }
    public static void basic1030(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.nextLong());
    }


    // 11. 8. 1011~1020n ,
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
    public static void basic1012() {
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
        System.out.printf("%d %d %d", i, i, i);
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
    public static void basic1001() {
        System.out.println("Hello");
    }
    public static void basic1002() {
        System.out.println("Hello World");
    }
    public static void basic1003() {
        System.out.println("Hello\nWorld");
    }
    public static void basic1004() {
        System.out.println("\'Hello\'");
    }
    public static void basic1005() {
        System.out.println("\"Hello World\"");
    }
    public static void basic1006() {
        System.out.printf("\"!@#$%%^&*()\"%n");
    }
    public static void basic1007() {
        System.out.println("\"C:\\Download\\hello.cpp\"");
    }
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

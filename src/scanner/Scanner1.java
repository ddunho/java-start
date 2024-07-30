package scanner;

import java.util.Scanner; //java library에 있는 스캐너를 가져와 쓴다.

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//scanner = 변수

        System.out.print("문자열을 입력하세요:");
        String str = scanner.nextLine(); //입력을 String으로 가져온다.
        System.out.println("입력한 문자열: " + str); //밑에서 입력을 하면 그대로 적용

        System.out.print("정수를 입력하세요:");
        int intValue = scanner.nextInt();
        System.out.println("입력한 정수: " + intValue);

        System.out.print("실수를 입력하세요:");
        double doubleValue = scanner.nextDouble();
        System.out.println("입력한 실수: " + doubleValue);
    }
}

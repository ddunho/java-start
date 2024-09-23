package scanner;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalCoast = 0;

        while (true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option = input.nextInt();

            if (option == 1) {
                input.nextLine();

            } else if (option == 2) {

            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;

            } else {
                System.out.println("올바른 옵션을 선택해주세요.");
            }
        }
    }
}

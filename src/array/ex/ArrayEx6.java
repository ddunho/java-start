package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        int minNumber, maxnumber;

        System.out.println(n + "개의 정수를 입력하세요:");
        for (int i = 0; i < n; i++){
            numbers[i] = scanner.nextInt();
        }


    }
}

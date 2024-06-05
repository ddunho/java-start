package cond;

public class If6 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000) {
            discount = discount + 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        } else if (age <= 10) { //if문의 처음을 만족해버렸기때문에 그 이후는 실행 x
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        } else {

            System.out.println("할인 없음");
        }
    }
}
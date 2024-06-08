package cond;

public class Switch3 {
    public static void main(String[] args) {
        int grade = 2;

        int coupon;
        switch (grade){
            case 1:
                coupon = 1000;
                break;
            case 2:
            case 3: //2를 왔다가 바로 3으로가서 3000을 입력
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }
        System.out.println("발급받은 쿠폰" + coupon);
    }
}
//예를들어서 grade가 2등급이면, case2가 실행되지만 case2는 break문이 없기때문에
//다음인 case3을 실행하게 된다.

package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        //intValue = doubleValue; 컴파일 오류 : 소수점이 날라가면 안되기때문
        intValue = (int) doubleValue; //소수점이 날라가도 변환하고싶을때 사용
        System.out.println(intValue);

        System.out.println((int) 10.5);

    }
}

package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; //int -> long (성립)
        System.out.println("longValue = " + longValue);

        doubleValue = intValue; //int -> double
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20L; //L : long
        System.out.println("doubleValue = " + doubleValue);
    }//작은범위에서 큰 범위로의 대입은 자바 언어에서 허용
}
/*
대입하는 형을 결국 맞춰야하기 때문에 개념적으로는 다음과 같이 동작한다
doubleValue = intValue
doubleValue = (double) intValue
doubleValue = (double) 10
doubleValue = 10.0
(double)과 같이 적어주면 int형이 double로 형이 변한다
 */

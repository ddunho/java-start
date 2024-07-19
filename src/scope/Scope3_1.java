package scope;

public class Scope3_1 {
    public static void main(String[] args) {
        int m = 10;
        int temp = 0;
        if (m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m= " + m); //temp 는 if문에서 사용하기 위함이기때문에 생존범위가 중요(비효율적)
    }//(temp를 계속 신경써야함)
}

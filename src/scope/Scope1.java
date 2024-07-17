package scope;

public class Scope1 {
    public static void main(String[] args) {
        int m = 10; //m 생존 시작
        if(true) {
            int x = 20; //x 생존 시작
            System.out.println("if m = " + m);// ctrl + d = 문장 복사
            System.out.println("if x = " + x); //둘 다 실행 됨
        } //x 생존 종료
        //System.out.println("main x = " + x); //x는 생존종료했기 떄문에 오류
        System.out.println("main m = " + m); //m은 생존하고있어서 가능
    } //m 생존 종료
}

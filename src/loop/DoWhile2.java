package loop;

public class DoWhile2 {
    public static void main(String[] args) {
        int i = 10;
        do {
            System.out.println("현재 숫자는:" + i);
            i++;

        } while (i < 3);
    } //do while문은 조건에 관계없이 문장을 한번은 무조건 실행 -> do를 실행한 후 조건문 실행
}

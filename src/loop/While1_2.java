package loop;

public class While1_2 {
    public static void main(String[] args) {
        int count = 0;
        //while은 참이면 코드블럭을 실행하고, 거짓이면 while문을 벗어난다
        while (count < 3){
            count++;
            System.out.println("현재 숫자는:" + count);
        }
    }
}

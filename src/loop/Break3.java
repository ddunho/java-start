package loop;

public class Break3 {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 1; ; i++){//for문은 조건식이 없으면 무한 반복한다. for문이 while문보다 깔끔하고 보기좋다.
            sum =sum + i; //i는 for문 안에서만 사용하는 변수
            if (sum > 10){
                System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
                break; //sum > 10을 만족하면 break문을 사용하여 while문을 벗어남
            }
            i++;

        }
    }
}

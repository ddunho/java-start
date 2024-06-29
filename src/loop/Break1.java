package loop;

public class Break1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while(true){ //while(true)는 무한 반복
            sum = sum + i;
            if(sum > 10){
                System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
                break; //break가 없으면 무한반복 > 탈출
            }
            i++;
        }
    }
}

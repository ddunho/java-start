package loop;

public class Continue1 {
    public static void main(String[] args) {
        int i = 1;

        while(i <= 5){
            if(i == 3){
                i++;
                continue; //continue 이후로 실행이 되는것이 아니라 while문으로 다시 돌아감
            }
            System.out.println(i);
            i++;
        }
    }
}

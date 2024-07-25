package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647; //int의 최고값
        long maxIntOver = 2147483648L; //int 최고값 + 1(초과)
        int intValue = 0;

        intValue = (int) maxIntValue; //형변환
        System.out.println("maxIntValue casting = " + intValue); //그대로 출력 가능

        intValue = (int) maxIntOver; //형변환
        System.out.println("maxIntOver casting = " + intValue);//int의 가장 작은숫자가 출력 : 다시 시작하는 느낌 > 오버플로우

    }
}

package operator;

public class Comp2 {
    public static void main(String[] args) {
        String str1 = "문자열1";
        String str2 = "문자열2";

        boolean result1 = "hello".equals("hello"); //리터럴 비교
        boolean result2 = str1.equals("문자열1"); //문자열 변수, 리터럴 비교
        boolean result3 = str1.equals("문자열2"); //문자열 변수 비교

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        //문자열 == 문자열은 클래스, 객체에 따라서 다르게 나올수있기때문에 equals()를
        // ;(세미콜론) 이없을때, Ctrl + Shift + Enter 를 누르면 문장을 완성시켜줌(; 추가해준다)
    }
}

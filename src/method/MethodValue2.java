package method;

public class MethodValue2 {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("1. changeNumber 호출 전, number: " + number); //출력 : 5
        changeNumber(number);
        System.out.println("4. changeNumber 호출 후, number: " + number); // 출력 : 5
    }
}

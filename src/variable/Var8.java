package variable;

public class Var8 {
    public static void main(String[] args) {
        //정수
        byte b = 126; //-128 ~ 127
        short s = 32767; // -32.768 ~ 32.767
        int i = 2147483647; //약 21억 -2147483648 ~ 2147483647
        long l = 9223372036854775807L; //뒤에 L을 붙여줘야함(l은 숫자 1과 헷갈려서 대문자 권장)
        //-9223372036854775808~ 9223372036854775807

        //실수
        float f = 10.0f; //뒤에 f를 붙여줘야함
        double d = 10.0; //double이 더 큰 실수를 다룰수있다
        //자주쓰이는것은 int, long, double boolean이고, 문자 하나던 문자열이던 String을 사용하는것이 편리
    }
}
//낙타 표기법 : 변수이름을 소문자로 시작하는것이 일반적이고, 그 이후의 각 단어는 대문자로 시작한다
package array.ex;

public class ArrayEx1 {
    public static void main(String[] args) {
        int student1 = 90;
        int student2 = 90;
        int student3 = 90;
        int student4 = 90;
        int student5 = 90;


        int total = student1 + student2 + student3 + student4 + student5;
        double average = (double) total / 5;

        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}

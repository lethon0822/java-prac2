package ch02.sec01;

public class VariableUseExample {
    public static void main(String[] args) {
        int hour = 3;
        int min = 5;
        int totalMin = hour * 60 + min;
        // hour, min 변수를 활용하여 아래처럼 출력
        System.out.printf("%d시간 %d분 \n", hour, min);
        System.out.printf("총 %d \n", totalMin);
    }
}

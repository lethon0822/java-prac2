package ch02.sec01;

public class VariableExchangeExample {
    public static void main(String[] args) {
        int x = 3, y = 5;
        System.out.printf("x: %d, y: %d\n", x, y);

        int temp;
        temp = x;
        x = y;
        y = temp;

        // x = 5, y = 3;
        System.out.printf("x: %d, y: %d\n", x, y);

    }
}

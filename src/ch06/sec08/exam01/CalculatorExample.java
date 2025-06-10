package ch06.sec08.exam01;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result = calc.plus(1, 2);
        System.out.println("result: " + result);
        System.out.println("result2: " + calc.plus(1, 20));
        System.out.println("끝");

        calc.powerOn();
    }
}

package ch06.sec08.exam04;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        double result = cal.areaRectangle(40.0);
        System.out.println("result: "+ result);

        double result2 = cal.areaRectangle(40.0, 50.0);
        System.out.println("result2: "+ result2);

    }
}

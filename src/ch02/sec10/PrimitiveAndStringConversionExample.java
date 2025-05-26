package ch02.sec10;

public class PrimitiveAndStringConversionExample {
    public static void main(String[] args) {
        int value1 = Integer.parseInt("10");
        System.out.println("value1: " + value1);

        double value2 = Double.parseDouble("3.14"); // Wrapper Type Class
        // double value2_1 = (double)"3.14"; <== 불가능. 메소드를 이용해야만 바꿀 수 있음.
        System.out.println("value2: " + value2);

        boolean value3 = Boolean.parseBoolean("true");
        System.out.println("value3: " + value3);

        int intValue = 10;
        String str1 = String.valueOf(10); // intValue + "" 해도 통하긴 함
        String str1_1 = String.valueOf(intValue); // intValue + "" 해도 통하긴 함
    }
}

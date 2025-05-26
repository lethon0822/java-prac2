package ch02.sec09;

public class OperationPromotionExample {
    public static void main(String[] args) {
        byte result1 = 10 + 20;
        System.out.println("result1: " + result1);

        byte v1 = 10, v2 = 20;
        int result2 = v1 + v2; // 자동 형변환
        System.out.println("result2: " + result2);

        byte v3 = 10;
        int v4 = 100;
        long v5 = 1000L;
        long result3 = v3 + v4 + v5;
        // ▼ 자동 형변환
        // v3(byte->int) + v4(int) ==> int
        // 110(int->long) + v5(long) ==> long

        char v6 = 'A';
        char v7 = 1;
        int result4 = v6 + v7;
        System.out.println("result4: " + result4);
        System.out.println("result4: " + (char)result4);

        int v8 = 10;
        int result5 = v8 / 4;   // int / int == > int (double로 바꿔도 같음)
        System.out.println("result5: " + result5);

        int v9 = 10;
        double result6 = v9 / 4.0;  // v9(int->double)
        System.out.println("result6: " + result6); // 2.5

        int v10 = 1;
        int v11 = 2;
        double result7 = v10 / v11;
        System.out.println("result7: " + result7);

    }
}

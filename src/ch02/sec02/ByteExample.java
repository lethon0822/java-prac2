package ch02.sec02;

public class ByteExample {
    public static void main(String[] args) {
        // byte : -128 ~ 127
        byte var1 = -128;
        byte var2 = -30;
        byte var3 = 127;
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);

        // byte var4 = -129;
        // byte var5 = 128; 컴파일 에러
        // 컴파일 에러 = 데이터 대입 불가능, 너무 큰 값이거나 타입이 맞지 않거나
    }
}

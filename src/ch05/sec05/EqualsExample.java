package ch05.sec05;

public class EqualsExample {
    public static void main(String[] args) {
        String strVar1 = "홍길동";
        String strVar2 = "홍길동";

        // 동일성(identity) : 주소값이 같다면 동일 ==
        // 동등성(equality) : 값이 같다면 동등 equals 메소드

        System.out.println(strVar1 == strVar2); // true
        System.out.println(strVar1.equals(strVar2)); // true

        String strVar3 = new String("홍길동");
        String strVar4 = new String("홍길동");

        System.out.println(strVar3 == strVar4);
        System.out.println(strVar3.equals(strVar4));
    }
}

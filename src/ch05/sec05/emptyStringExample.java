package ch05.sec05;

public class emptyStringExample {
    public static void main(String[] args) {
        String hobby = "";
        if("".equals(hobby)){   // error 날 확률 zero
            System.out.println("hobby 변수는 빈 문자열 객체를 참조");
        }
    }
}

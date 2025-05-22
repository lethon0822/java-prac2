package ch02.sec01;

import static java.lang.Math.pow;

public class PrimitiveType {
    /*
    기본(원시) 타입 (Primitive Type) - 총 8가지
    - 정수 : byte(1byte), short(2), int(4), long(8)
    - 실수 : float(4), double(8)
    - 문자 : char(2)
    - 논리 : boolean(1)
    그 외는 모두 레퍼런스 타입
    모두 타입명이 소문자로 구성
     */

    public static void main(String[] args) {
        // 10진수를 2진수로 만들기
        int num = 85;
        int[] mod = new int[10];
        int i = 0;

        while(true){

            mod[i] = num % 2;
            num = num / 2;
            i++;
            if ( num == 1 ) {
                mod[i] = 1;
                break;
            }
        }
        for (i = 0; i<mod.length; i++){
            System.out.println(mod[i]);
        }

        for (i = 0; i<mod.length; i++){
            num += mod[i] * (int)Math.pow(2, i);
        }
        System.out.println("------------");
        System.out.println(num);
    }
}

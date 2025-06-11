package ch06.sec11;

import java.io.PrintStream;

public class FinalStudy {
    public static void main(String[] args) {
        final int NUM = 10; // 상수화
        // NUM = 20;    // error
        final int NUM_2;    // 작명법 : 스네이크 케이스
        NUM_2 = 10;
        // NUM2 = 20;   // error, 한번 값이 지정되면 변경할 수 없다.

        PrintStream ps = System.out;   // 객체 생성 없이 사용 가능 (static, final)
        ps.println();
        double d = Math.PI;     // 같은 이유 (static, final)

        FinalObject fo1 = new FinalObject(10);
        FinalObject fo2 = new FinalObject(20);

        fo1.myAge();  // immutable (불변성)
        fo2.myAge();  // setter를 안 만들면 final 없이 불변성을 지킬 수 있음
    }
}

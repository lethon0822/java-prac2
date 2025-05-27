package ch03.sec12;

public class OperatorPriorExanoke {
    public static void main(String[] args) {
        /*
        연산 우선순위
        (x > 0 ^%% u < 00) 이 연산 순서는
        x > = 0, y < 0 결과 불린값 && 결과 불린 값

        1. 100 x 2;
        2, 1의 결과값 / 3;
        3. 2의 결과값 % 5;
        */

        int a, b, c;
        a = b = c = 5;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);

        int var1 = 1, var2 = 2, var3 = 3;
        int result1 = var1 + var2 * var3;
        System.out.println("result1: " + result1);
        int result2 = (var1 + var2) * var3;
        System.out.println("result2: " + result2);
    }
}

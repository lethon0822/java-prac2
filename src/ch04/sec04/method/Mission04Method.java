package ch04.sec04.method;

public class Mission04Method {
    public static void main(String[] args) {
        // gugudan(4);
        gugudan(2, 4);
    }

    public static void gugudan(int dan) {
        for (int i = 1; i<=9; i++) {
            System.out.printf("%d x %d = %d\n", dan, i, dan * i);
        }
    }

    public static void gugudan(int fromDan, int toDan) {
        for (int i = fromDan; i <=toDan; i++){
            System.out.printf("=== %d 단 === \n", i);
            gugudan(i);
        }
    }
}

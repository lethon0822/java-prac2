package ch06.sec10;

public class SamsungTV {
    public static String brand;
    public String model;
    public int inch;

    public void printValues(){
        System.out.printf("%s, %s, %d\n", brand, model, inch);
    }

    // static 메소드에는 static 변수만 사용할 수 있음 (model과 inch는 사용 불가능)
    // static이 안 붙은 변수를 메소드 안에서 사용하려고 하면 error
    // model 변수와 inch 변수를 사용하려면 객체를 생성해야 함
    public static void staticMethod() {
    //  System.out.printf("%s, %s, %d\n", brand, model, inch);
    }

    // 아래같은 경우 사용 가능 (static이 부여되지 않은 파라미터를 통해서)
    public static void staticMethod(int n1, int n2){
        System.out.printf("%s, %d, %d", brand, n1, n2);
    }
}

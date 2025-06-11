package ch06.sec11;

public class FinalObject {
    // 상수 멤버 필드는 반드시 초기화를 해야 함
    private final String NAME = "홍길동";

    // 생성자로 값을 넣는다는 내용이 있을 경우 선언만 해도 됨
    public final int AGE;
    public FinalObject (int age){
        this.AGE = age;
    }

    public void myAge() {
        System.out.println("age: " + this.AGE);
    }

}

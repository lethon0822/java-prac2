package ch07.sec07;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        child.method01();
        child.method02();
        child.method03();

        Parent parent = child;
        // 타입은 알고 있는 메소드만 호출 가능
        parent.method01();
        parent.method02();
//        parent.method03(); error
        Child child2 = (Child) parent;
        child2.method03();
    }
}

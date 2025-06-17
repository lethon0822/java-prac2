package ch07.sec07;

public class exam01 {
    public class PromotionExample {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        A a1 = b;   // 부모 타입은 자식 객체 주소값 담을 수 있음 (다형성) - 상속 관계일때만
        A a2 = e;   // 직속 부모일 경우만은 X, 자식 중에 있기만 하면 OK, 자동 형변환 발생

        //      D d2 = e;  error
        E e2 = (E) a2; // 가능, 현재 e의 주소값을 가지고 있음, 강제 형변환을 해야 함
//      D d3 = (D) b;  // error, 자식 타입은 부모 객체 주소값 받을 수 없음
    }
}
class A {}
class B extends A {}
class C extends A {}

class D extends B {}

class E extends C {}
package ch08.sec11.exam02;

// 운송수단, 탈것
public interface Vehicle {
    // 인터페이스에서 할 수 없는 것 :
    // 1. static final이 붙지 않은 멤버 필드를 가질 수 없음(인스턴스 멤버필드를 가질 수 없다.)
    // 2. 추상 메소드만 가질 수 있음
    // 3. public abstract는 생략 가능(자동으로 붙음)

    void run();
    void stop();

}

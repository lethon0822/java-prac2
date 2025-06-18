package ch07.sec07.poly;

// 추상 클래스
// 추상 클래스는 객체화가 되지 않음 (추상 메소드가 없더라도, 자식에게 상속해주기 위해)
public abstract class Animal {
    private int age;

    // 추상 메소드
    // 추상 메소드를 하나라도 갖고 있다면 클래스는 추상 클래스여야 한다.
    public abstract void crying();
}
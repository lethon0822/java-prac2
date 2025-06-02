package ch06.sec04;

public class StudentExample {
    public static void main(String[] args) {
        // 둘은 주소값이 다름 (초기화되지 않은 상태로는 동등하지만 동일하지 않음)
        // 객체 생성 시에만 new를 사용함(생성자), 주소값을 저장
        // 객체가 생성된 이후 메소드는 다른 클래스의 생성자라면 호출 가능
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "홍길동";
        s2.name = "신사임당";
        s1.introduce();
        s2.introduce();
    }
}

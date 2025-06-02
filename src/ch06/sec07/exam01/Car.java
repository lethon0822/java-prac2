package ch06.sec07.exam01;

public class Car {
    String model;
    boolean start;
    int speed;

    // 3개의 파라미터를 받아서 객체 내 변수에 대입
    // 기본 생성자는 : 정의된 생성자가 하나도 없을때 자동 생성되는 것
    /* 생성자 특징 1. 클래스와 이름이 반드시 일치함
                  2. 리턴 타입이 없음
                  3. 정보 은닉화, 캡슐화, 상속성, 다형성      */
    /* 오버로딩(Overloading) : 같은 이름의 메소드를 여러개 만들 수 있음
          - 조건 : 파라미터 타입의 순서나 개수가 달라야 함     */
    Car () {}

    Car (String model, boolean start, int speed){
        this.model = model;
        this.start = start;
        this.speed = speed;
    }
}

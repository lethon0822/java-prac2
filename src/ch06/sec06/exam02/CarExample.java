package ch06.sec06.exam02;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        
        System.out.println("제작회사: " + myCar.company);
        System.out.println("모델명: " + myCar.model);
        System.out.println("최고속도: " + myCar.maxSpeed);
        System.out.println("현재속도: " + myCar.speed);
        System.out.println("------------------");
        myCar.speed = 20; // 명시적 초기화되어도 변수를 불러와 수정할 수 있음
        System.out.println("현재속도: " + myCar.speed);
    }
}

package ch06.sec06.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car(); // 초기화를 하지 않아 null, false, 0

        System.out.println("모델명: " + car.model);
        System.out.println("시동여부: " + car.start);
        System.out.println("현재속도: " + car.speed);
    }
}

package ch06.sec09;

public class StaticCarExample {
    public static void main(String[] args) {
        // Static으로 이루어진 클래스의 경우 공간이 하나만 부여되기 때문에
        // 굳이 객체 생성을 하지 않아도 클래스로 접근해서
        // 값을 넣을 수 있고 메소드를 사용할 수 있다.
        StaticCar.model = "벤츠";
        StaticCar.setSpeed(200);
        StaticCar.run();

        StaticCar car1 = new StaticCar("BMW");
        car1.setSpeed(100);
        car1.run();
    }
}

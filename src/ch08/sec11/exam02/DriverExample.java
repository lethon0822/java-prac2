package ch08.sec11.exam02;

public class DriverExample {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Taxi taxi = new Taxi();
        Driver driver = new Driver();
        //driver.drive(bus);
        driver.drive(taxi);

        // 익명 객체 (조금 자주 씀, 람다식을 이해할 때 필요)
        // Vehicle 인터페이스를 implements한 객체의
        // 주소값이 vehicle 변수에 들어간다.
        // implements를 바로 할 수 있음
        Vehicle vehicle = new Vehicle() {
            @Override
            public void run() {
                System.out.println("버스가 달린다.");
            }

            @Override
            public void stop() {
                System.out.println("버스가 멈춘다.");
            }

            public void openBackDoor() {
                System.out.println("버스 뒷문이 열린다.");
            }
        }; // <<
    }
}

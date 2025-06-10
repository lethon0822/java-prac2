package ch06.sec08.exam03;

public class Car {
    /* 접근 제어자
        private - 같은 클래스 안에서만 접근 가능
        default - private + 같은 패키지 안에서는 접근 가능 (잘 사용 안함)
        protected - default + 상속 관계는 접근 가능
        public - 전체적으로 접근 가능

        private 멤버 필드에 값 대입 방법 2가지
            1. 생성자 사용
            2. (setter) 메소드 사용

        private 멤버 필드에 값 읽기 방법 1가지
            1. (getter) 메소드 사용
     */

    private int gas;
    private int oil;

    public Car() {
    }

    public Car(int gas, int oil) {
        this.gas = gas;
        this.oil = oil;
    }

    public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    public int getOil() {
        return oil;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }
}

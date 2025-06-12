package ch07.sec02;

public class SmartPhone extends Phone {
    private boolean wifi;

    public SmartPhone(String model, String color) {
        super(model, color);    // 직속 부모의 기본 생성자 호출, 생성자의 가장 위에
        System.out.println("SmartPhone 생성자 호출!");
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public void internet() {
        System.out.println("인터넷에 연결합니다.");
    }

    // 오버라이딩
    public void bell(){
        System.out.println("스마트폰이 울린다!");
    }
}
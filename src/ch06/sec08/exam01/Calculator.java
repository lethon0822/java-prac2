package ch06.sec08.exam01;

public class Calculator {

    public double areaRectangle;

    public void powerOn() {
        System.out.println("전원을 켭니다.");
        // 리턴값 미존재
    }
    public void powerOff() {
        System.out.println("전원을 끕니다.");
        // 리턴값 미존재
    }

    public int plus (int n1, int n2){
        int result = n1 + n2;
        return result;
    }
}

package ch07.sec07.poly02;

public class TV extends Product {
    // TV는 Product를 상속받는다.
    // TV의 가격은 1,000,000원
    // TV 객체의 주소값을 println에 찍으면 TV가 출력되어야 함
    public TV() {
        super(100);
    }

    @Override
    public String toString(){
        return "TV";
    }
}

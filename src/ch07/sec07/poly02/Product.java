package ch07.sec07.poly02;

    // 객체화 금지
public abstract class Product {
    // 캡슐화
    private final int price;    // 제품의 가격 정보 (만원 단위)
    private final int bonusPoint;   // 제품 구매시 제공하는 보너스 점수

    // immutable 해야 함
    public Product(int price) {
        this.price = price;
        this.bonusPoint = (int) (price * 0.1);   // 가격의 10%
    }

    // 외부에 값을 보내줄 수 있다.
    public int getPrice() {
        return this.price;
    }

    public int getBonusPoint() {
        return this.bonusPoint;
    }
}



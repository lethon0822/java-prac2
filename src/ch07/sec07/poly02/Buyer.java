package ch07.sec07.poly02;

public class Buyer {
    //
    private int money;
    private int bonusPoint = 0;

    public Buyer(){
        money = 1000;
    }

    public int getMoney () {
        return this.money;
    }

    public int getBonusPoint() {
        return this.bonusPoint;
    }

    public void buy (Product product) {
        if (money < product.getPrice()) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        this.money -= product.getPrice();
        this.bonusPoint -= product.getBonusPoint();

        System.out.println(product + "을/를 구입하였습니다.");
    }

//        장렬히 전사한 흔적
//        if (money < product.getPrice()) {
//            System.out.println("잔액이 부족합니다.");
//            return;
//        } else {
//            if (product instanceof TV) {
//                System.out.println(((TV) product).toString() + "을/를 구입하셨습니다.");
//                money -= ((TV) product).getPrice();
//                bonusMoney += (int) (((TV) product).getPrice() * 0.1);
//            } else if (product instanceof Computer) {
//                System.out.println(((Computer) product).toString() + "을/를 구입하셨습니다.");
//                money -= ((Computer) product).getPrice();
//                bonusPoint += (int) (((Computer) product).getPrice() * 0.1);
//            }
//        }
}

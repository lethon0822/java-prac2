package ch07.sec07.poly02;

public class Poly02Example {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        buyer.buy(new TV());
        buyer.buy(new TV());
        buyer.buy(new TV());`
        buyer.buy(new Computer());
        buyer.buy(new Computer());
        buyer.buy(new Computer());
        System.out.println("잔액: " + buyer.getMoney());
        System.out.println("보너스: " + buyer.getBonusPoint());
    }
}

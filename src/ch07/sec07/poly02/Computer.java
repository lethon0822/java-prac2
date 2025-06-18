package ch07.sec07.poly02;

public class Computer extends Product {
    // Computer는 Product를 상속받는다.
    // Computer의 가격은 무조건 200
    // println ==> "Computer"

    public Computer (){
        super(200);
    }

    @Override
    public String toString() {
        return "Computer";
    }
}

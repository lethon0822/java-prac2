package ch07.sec07.poly;

public class BullDog extends Dog {
    public void crying() {
        System.out.println("월~ 월~");
    }

    public void jump() {
        System.out.println("불독이 ");
        super.jump();
    }
}

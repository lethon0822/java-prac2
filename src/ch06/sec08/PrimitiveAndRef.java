package ch06.sec08;

public class PrimitiveAndRef {
    public static void main(String[] args) {
        int num = 10;
        changeNum(num);
        System.out.println("num: " + num);

        NumBox numBox = new NumBox();
        numBox.num = 10;
        changeNum(numBox);
        System.out.println("numBox.num: " + numBox.num);
    }

    public static void changeNum(int num) {
        num = 20;
    }
    public static void changeNum(NumBox numBox) {
        numBox.num = 20;
    }
}

class NumBox {
    int num;
}
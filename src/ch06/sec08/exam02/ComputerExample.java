package ch06.sec08.exam02;

public class ComputerExample {
    public static void main(String[] args) {
        Computer computer = new Computer();
        // 배열로 넘어감
        int result = computer.sum(1, 2, 3);
        System.out.println("result: " + result);
        int result2 = computer.sum(1, 2, 3, 4);
        System.out.println("result2: " + result2);
        int result3 = computer.sum(1, 2, 3, 4, 5);
        System.out.println("result3: " + result3);

    }
}

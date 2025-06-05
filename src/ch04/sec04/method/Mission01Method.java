package ch04.sec04.method;

public class Mission01Method {
    public static void main(String[] args) {
        int sum1 = sumFromTo(10, 20);
        int sum2 = sumFromTo(15, 49);
        System.out.println(sum1);
        System.out.println(sum2);
    }

    public static int sumFromTo (int from, int to) {
        int sum = 0;
        for (int i = from; i <= to; i++) {
            sum += i;
        }
        return sum;
    }
}

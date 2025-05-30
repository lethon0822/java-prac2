package ch05.sec06;

public class ArrayRefObjectExample {
    public static void main(String[] args) {
        String[] strArray = new String[3];
        strArray[0] = "Java"; // 1과 동일 (==)
        strArray[1] = "Java"; // 2와 동등 (equals)
        strArray[2] = new String("Java");

        System.out.println(strArray[0] == strArray[1]);
        System.out.println(strArray[1] == strArray[2]);
        System.out.println(strArray[1].equals(strArray[2]));
    }
}

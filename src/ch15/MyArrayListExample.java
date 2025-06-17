package ch15;

public class MyArrayListExample {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        int length = list.size();
        System.out.println("legnth: " + length);
        list.add("가");
        list.checkValues();
        list.add("나");
        list.checkValues();
        list.add("다");
        list.add("라");
        list.checkValues();
        list.add(1, "크");
        list.checkValues();

        String str2 = list.remove();
        System.out.println("str2: " + str2);
        list.checkValues();

        String str3 = list.remove(1);
        System.out.println("str3: " + str3);
        list.checkValues();
    }
}

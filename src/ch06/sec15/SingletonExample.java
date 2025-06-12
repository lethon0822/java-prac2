package ch06.sec15;

public class SingletonExample {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);

        // Static Method 에서 호출할때는 클래스명을 같이 붙여서
        Singleton singleton02 = Singleton.getInstance();
        System.out.println(singleton);
        System.out.println(singleton);
        System.out.println(singleton);

    }
}

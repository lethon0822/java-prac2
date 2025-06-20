package control.ioc;

import control.TV;

public class Test {
    public static void main(String[] args) {
        TVFactory tvFactory = TVFactory.getInstance();

        // TVFactory tvFactory1 = new TVFactory();

        TV tv = tvFactory.factory("harman","genelec");
        tv.sound();
    }
}

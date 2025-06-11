package ch06.sec10;

public class SamsungTVExample {
    public static void main(String[] args) {
        SamsungTV.brand = "Samsung";

        SamsungTV tv1 = new SamsungTV();
        tv1.model = "ABC";
        tv1.inch = 65;

        SamsungTV tv2 = new SamsungTV();
        tv2.model = "가나다";
        tv2.inch = 85;
        //tv2.brand = "삼성";

        tv1.printValues();
        tv2.printValues();
    }
}

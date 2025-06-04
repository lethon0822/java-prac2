package ch02.sec01.method;

public class VariableUseExample {
    public static void main(String[] args) {
        printTime(10, 20);
        printTime(2, 9);
        printTime(10, 9, 42);
        printTime(10, 9, 02);
    }

    //    오버로딩(overloading)
    public static void printTime (int hour, int min, int sec) {
        System.out.printf("%02d:%02d:%02d\n", hour, min, sec);

//        System.out.print(hour < 10 ? "0"+ hour : String.valueOf(hour));
//        System.out.print(min < 10 ? ":0" + min : ":" + String.valueOf(min));
//        System.out.print(sec < 10 ? ":0" + sec : ":" + String.valueOf(sec));
//        System.out.println();

        System.out.print(hour + ":");
        printTime(min, sec);
    }
    public static void printTime (int hour, int min) {
        System.out.printf("%02d:%02d\n", hour, min);

//        System.out.print(hour < 10 ? "0"+ hour : String.valueOf(hour));
//        System.out.print(min < 10 ? ":0" + min : ":" + String.valueOf(min));
//        System.out.println();
    }
}
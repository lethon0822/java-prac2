package ch02.sec01.method;

public class VariableUseExample02 {
    public static void main(String[] args) {
        printTime(10, 20);
        printTime(2, 9);
        printTime(10, 9, 42);
        printTime(10, 9, 02);
    }

    public static String parseTime (int value) {
        return value < 10 ? "0"+ value : String.valueOf(value);
    }
    //    오버로딩(overloading)
    public static void printTime (int hour, int min, int sec) {
        String strHour = parseTime(hour);
        System.out.print(strHour + ":");
        printTime(min, sec);
    }
    public static void printTime (int hour, int min) {
        System.out.println(parseTime(hour) + ":" + parseTime(min));
    }
}
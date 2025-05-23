package ch02.sec07;

public class PromotionStudy {
    public static void main(String[] args) {
        /*
        자동 타입 변환(promotion) : 작은 타입이 큰 타입으로 대입될 때 발생
        byte < short, char < int < long < float < double
        모든 타입 + String이 되면 모든 타입으로 String으로 파싱
         */

        byte byteVal = 10;
        int intVal = byteVal; // protmotion
        System.out.println("intVal: " + intVal);

        char charVal = '가';
        int intVal2 = charVal;
        System.out.println("intVal: " + intVal2);
        System.out.printf("44032: %c\n", intVal2);

        long longVal2 = 9223372036854775807L;
        float floatVal = longVal2;
        System.out.println("floatVal: " + floatVal);


        float floatVal2 = 100.4f;
        double doubleVal = floatVal2;
        System.out.println("doubleVal: " + doubleVal);
    }
}

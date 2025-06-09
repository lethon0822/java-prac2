package ch05.sec05.Method;

public class CharAtMethod {
    public static void main(String[] args) {
        String gender = checkGender("900212-1998756");  // 남자
        String gender2 = checkGender("900212-2998756"); // 여자

        System.out.println(gender);
        System.out.println(gender2);
    }

    public static String checkGender(String ssn){
        String result = null;
        switch (ssn.charAt(7)) {
            case '1', '3' -> result="남자";
            case '2', '4' -> result="여자";
        }
        return result;
    }
}

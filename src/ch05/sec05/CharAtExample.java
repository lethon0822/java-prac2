package ch05.sec05;

public class CharAtExample {
    public static void main(String[] args) {
        String ssn = "950624-1230123";
        char genNum = ssn.charAt(7);    // ex) 7번칸 자리의 글자 추출
        String gender = "";

        switch (genNum){
            case '1', '3' -> gender = "남성";
            case '2', '4' -> gender = "여성";
        }

        System.out.println("gender: " + gender);
    }
}

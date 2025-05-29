package ch05.sec05.Mission;

import java.util.Scanner;

public class Mission01 {
    public static void main(String[] args) {
        System.out.print("주민번호를 입력하시오(xxxxxx-xxxxxxx) : ");
        Scanner scanner = new Scanner(System.in);
        String ssn = scanner.nextLine();
        char genNum = ssn.charAt(7);
        String gender = "";
        if (ssn.length() == 14) {
            switch (genNum) {
                case '1', '3' -> gender = "남성";
                case '2', '4' -> gender = "여성";
                default -> System.out.println("잘못 입력하셨습니다(데이터오류)");
        }} else {
            System.out.println("잘못 입력하셨습니다(길이오류)");
        }
        System.out.println("gender : " + gender);
    }
}

package ch04.sec02;

import java.util.Scanner;

public class Mission02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력해주세요 > ");
        String strScore = scanner.next();
        int intScore = Integer.parseInt(strScore);

        int intScoreDiv10 = intScore / 10;
        String grade = "D";
        if (intScore > 100 || intScore < 0) {
            System.out.println("잘못된 점수입니다.");
            return;
        } else {
            switch(intScoreDiv10){
                case 9:
                    grade = "A";
                    break;
                case 8:
                    grade = "B";
                    break;
                case 7:
                    grade = "C";
                    break;
                default:
                    break;
            }

        }
        System.out.println("학점: " + grade);

    }
}

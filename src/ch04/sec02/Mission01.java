package ch04.sec02;

import java.util.Scanner;

public class Mission01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력해주세요 > ");
        String strScore = scanner.next();

        //int intScore2 = scanner.nextInt();
        try {
            int intScore = Integer.parseInt(strScore);
            if (intScore >= 60) {
                System.out.println("합격입니다.");
            } else {
                System.out.println("불합격입니다.");
            }
        } catch (Exception e) {
            System.out.println("숫자만 입력해주세요.");
        }
    }
}

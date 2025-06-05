package ch02.sec11;

public class ScoreMethodExample {
    public static void main(String[] args) {
        int randomScore = getRandomValue(-10, 120);
        // int randomScore2 = getRandomValue(1, 5);
        System.out.println(randomScore);
        // System.out.println(randomScore2);

        // 100점 초과시 혹은 0점 미만 시 ' ' 리턴
        char grade = getGrade(randomScore);
        System.out.println("grade: " + grade);
    }

    public static int getRandomValue (int min, int max) {
        int randomNum = (int)(Math.random() * max - min + 1) + min;
        return randomNum;
    }

    public static char getGrade(int score) {
        char grade = 'D';
        if ( 0 > score || score > 100)
            grade = ' ';
        else {
            if (score >= 90) {
                grade = 'A';
            } else if (score >= 80) {
                grade = 'B';
            } else if (score >= 70) {
                grade = 'C';
            } else { }
        }
        return grade;
    }
}

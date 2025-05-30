package ch05.sec06;

public class ArrayCreateByValueListExample {
    public static void main(String[] args) {
        String[] season = {"Spring", "Summer", "Fall", "Winter"};

        System.out.println("season[0]: " + season[0]);
        System.out.println("season[0]: " + season[0]);

        season[0] = "봄";
        System.out.println("season[1]: " + season[1]);

        int[] scores = {83, 90, 87};
        int sum = 0;

        // 아래 두 for문 다 같은 방법
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        sum = 0;
        for (int score : scores) {
            sum += score;
        }
        System.out.println(sum);

        double avg = (double)sum/scores.length;
        System.out.printf("%.2f", avg);


    }
}

package ch04.sec04;

public class Mission07 {
    public static void main(String[] args) {
        // 학생의 평균 점수 구하기
        int[] scores = { 90, 88, 100, 70, 60 };
        int sum = 0; // int로 하는 걸 추천
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println((double)(sum / scores.length));
    }
}

package ch04.sec04.method;

public class Mission07Method {
    public static void main(String[] args) {
        int[] scores = { 90, 88, 100, 70, 60, 90, 89 };
        double avg = getAverage(scores);
        System.out.println("avg: " + avg);
    }

    public static double getAverage(int[] scores){
        int sum = Mission05Method.addAllUpArray(scores);
        return (double)sum / scores.length;
    }
}

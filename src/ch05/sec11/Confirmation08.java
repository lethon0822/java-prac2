package ch05.sec11;

public class Confirmation08 {
    public static void main(String[] args) {
        int[][] arr = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };
        int sum = 0;
        int totalLength = 0;

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length ; j++){
                sum += arr[i][j];
            }
            totalLength += arr[i].length;
        }

        System.out.println("sum: " + sum);
        System.out.println("avg: " + (double)sum / totalLength);
    }
}

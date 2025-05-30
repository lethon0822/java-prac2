package ch05.sec06;

import java.util.Arrays;

public class ArrayCreateByValueListExample2 {
    public static void main(String[] args){
//        int[] scores = {83, 90, 87};  // 보통 선언
//        int[] scores;
//        scores = {83, 90, 87}    // error
        int[] scores;
        scores = new int[]{83, 90, 87}; // not error
        System.out.println("main: " + Arrays.toString(scores));
        printItem(scores);

        int[] arr = {10, 20, 30, 40, 50};
        printItem(arr);
    }
//             리턴타입 메소드이름  파라미터(매개변수) - 셸로우 카피
    public static void printItem (int[] arr) {
//        System.out.println("printItem: " + Arrays.toString(arr));
        for (int i = 0; i<arr.length; i++){
            System.out.printf("score[%d]: %d\n", i, arr[i]);
        }
    }
}

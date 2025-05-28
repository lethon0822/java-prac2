package ch04.sec09;

import java.util.Arrays;

public class ArrayShuffleExample {
    public static void main(String[] args) {

        // 10칸짜리 정수 배열을 넣어 1에서 10까지의 값을 더함
        // 이후 0~9 랜덤값을 만든 후 7이 나오면 0번방과 7번방의 값을 교환
        //                         8이 나오면 1번방과 8번방의 값을 교환

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        //System.out.println(Arrays.toString(arr));

        //int num = (int)(Math.random()*10.0);
        System.out.println("기본 : " + Arrays.toString(arr));
        for (int i = 0; i<arr.length; i++){
            int num = (int)(Math.random()*10.0);
            int temp = arr[num];
            arr[num] = arr[i];
            arr[i] = temp;
            System.out.print(num + " : ");
            System.out.println(Arrays.toString(arr));

        }
    }
}

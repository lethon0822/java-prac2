package ch04.sec09;

import java.util.Arrays;

public class ArrayShuffleMethod {
    public static void main(String[] args) {
        int[] arr = makeArrFromTo(5, 8);
        int[] arr2 = makeArrFromTo(15,20);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        shuffleArray(arr);
        shuffleArray(arr2);
    }

    public static int[] makeArrFromTo (int from, int to) {
        int[] arr = new int[to-from];
        for (int i = 0; i <arr.length; i++){
            arr[i] = from++;
        }
        return arr;
    }

    public static void shuffleArray (int[] arr){
        for (int i = 0; i<arr.length; i++) {
            int num = (int)(Math.random() * arr.length);
            int temp = arr[num];
            arr[num] = arr[i];
            arr[i] = temp;
            System.out.print(num + " : ");
            System.out.println(Arrays.toString(arr));
        }
    }
}

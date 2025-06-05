package ch04.sec04.method;

import java.util.Arrays;

public class Mission02Method {
    public static void main(String[] args) {
        printNumberFromTo(2, 6);
        printNumberFromTo(12, 16);
    }

    public static void printNumberFromTo(int from, int to){
        System.out.print("[");
        System.out.print(from);
        for (int i = from+1; i <=to; i++){
            System.out.print(", " + i);
        }
        System.out.println("]");

        int[] arr = new int[to-from+1];
        for (int i = 0; i<arr.length; i++){
            arr[i] = from++;
        }
        System.out.println(Arrays.toString(arr));
    }
}

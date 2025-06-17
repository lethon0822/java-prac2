package ch15;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyArrayList {
    private String[] arr = new String[0];

    public int size(){
        return this.arr.length;
    }

    public void add(String str) {
        String[] temp = new String[size() +1];
        temp[size()] = str;
        for (int i = 0; i < size(); i++){
            temp[i] = arr[i];
        }
        this.arr = temp;
    }

    public void add(int index, String str) {
        String[] temp = new String[size()+1];
        temp[index] = str;
        for (int i = 0; i< size(); i++) {
            temp[i < index ? i : i + 1] = arr[i];
//            풀려다 망한것
//            if (i < index) {
//                temp[i] = arr[i];
//            } else if (i >= index) {
//                temp [i+1] = arr[i];
//            }
        }
        this.arr = temp;
    }

    public String get(int index) {
        return this.arr[index];
    }

    public String remove() {
        String[] temp = new String[size()-1];
        String item = arr[temp.length];
        for (int i = 0; i < temp.length; i++){
            temp[i] = arr[i];
        }
        this.arr = temp;
        return item;
    }

    public String remove(int index) {
        String item = arr[index];
        String[] temp = new String[size()-1];
        for (int i = 0; i < temp.length; i++){
            temp[i] = arr[i<index ? i : i+1];
        }
        arr = temp;
        return item;
    }

    public void checkValues() {
        System.out.println(Arrays.toString(arr));
    }
}

package ch05.sec11;

public class Mission01 {
    public static void main(String[] args) {
        int sum = 0;
        for (String item : args){
            sum += Integer.parseInt(item);
        }
        System.out.println("sum: " + sum);
    }
}

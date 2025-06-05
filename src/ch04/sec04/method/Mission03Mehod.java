package ch04.sec04.method;

import ch02.sec11.ScoreMethodExample;

public class Mission03Mehod {

    public static void main(String[] args) {
        int star = ScoreMethodExample.getRandomValue(3,7);
        System.out.println("star: " + star);

        printSingleLine(star);
        System.out.println("-----------");
        printMultiLine(star);
        System.out.println("-----------");
        printTriangleLine(star);
    }

    public static void printSingleLine(int cnt) {
        for (int i = 0; i < cnt; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printMultiLine (int cnt) {
        for (int i = 0; i < cnt; i++){
            printSingleLine(cnt);
        }
    }

    public static void printTriangleLine (int cnt) {
        for (int i = 1; i <=cnt; i++) {
            printSingleLine(i);
        }
    }
}


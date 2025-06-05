package ch02.sec03;

public class CharMethodExample {
    public static void main(String[] args) {
        printCharToInt('c');
        printCharToInt('가');
        printCharToInt('!');

        int value = getCharToInt('c');
        System.out.println("value: " + value);
    }

    public static void printCharToInt(char ch) {
        System.out.printf("%c: %d\n", ch, (int)ch);
    }

    public static int getCharToInt(char ch) {
        return (int)ch;
    }
}

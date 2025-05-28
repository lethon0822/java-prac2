package ch04.sec04;

public class Mission03 {
    public static void main(String[] args) {
        int star = (int)(Math.random() * 6.0) + 3;
        System.out.println("star: " + star);

//        for (int i = 0; i < star; i++) {
//            for (int j = 0; j < star; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        for (int i = 0; i <star*star; i++){
            if (i % star == 0 && i != 0)
                System.out.println();
            System.out.print("*");
        }
    }
}

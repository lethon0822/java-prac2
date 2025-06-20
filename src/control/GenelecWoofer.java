package control;

public class GenelecWoofer implements Woofer {
    private Woofer woofer;

    @Override
    public void baseSound() {
        System.out.println("Genelec Woofer: 웅!! 웅!! 웅!!");
    }
}

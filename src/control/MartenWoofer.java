package control;

import control.legacy.HarmanSpeaker;

public class MartenWoofer implements Woofer {
    private Woofer woofer;

    @Override
    public void baseSound() {
        System.out.println("Marten Woofer: 웅~ 웅~ 웅~");
    }
}

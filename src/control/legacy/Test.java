package control.legacy;

import control.JBLSpeaker;
import control.Speaker;
import control.TV;

public class Test {
    public static void main(String[] args) {
        Speaker speaker = new HarmanSpeaker();
        speaker.speakerSound();

        System.out.println("-------------");
        Speaker speaker2 = new JBLSpeaker();
        speaker2.speakerSound();

        System.out.println("-------------");
        TV tv = new SamsungTV();
        tv.sound();
    }
}

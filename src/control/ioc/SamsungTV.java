package control.ioc;

import control.Speaker;
import control.TV;

public class SamsungTV implements TV {
    // 삼성 TV는 스피커를 사용할 수 있다.
    // 스피커는 HarmanSpeaker를 사용한다.
    private Speaker speaker;

    public SamsungTV(Speaker speaker){
        this.speaker = speaker;
    }

    @Override
    public void sound() {
        System.out.println("SamsungTV의 소리는요");
        speaker.speakerSound();
    }
}

package control.ioc;

import control.*;

public class TVFactory {
    // 싱글톤 사용
    private static TVFactory tvFactory;

    private TVFactory(){}

    // 객체 생성 없이 하는 법 ==> static
    // static 메소드에서는 static 필드만 접근 가능
    public static TVFactory getInstance(){
        if(tvFactory == null) {
            tvFactory = new TVFactory();
        }
        return tvFactory;
    }

    public TV factory(String speakerName, String wooferName){
        // 삼성 TV 객체화 하려면 Speaker의 주소값 필요
        // 스피커가 객체화 하려면 woofer의 주소값 필요

        Woofer woofer = switch (wooferName){
            case "marten" -> new MartenWoofer();
            case "genelec" -> new GenelecWoofer();
            default -> null;
        };

        Speaker speaker = switch (speakerName){
            case "jbl" -> new JBLSpeaker(woofer);
            case "harman" -> new HarmanSpeaker(woofer);
            default -> null;
        };

        return new SamsungTV(speaker);
    }
}

package ch15;

import blackjack.Card;

import java.util.LinkedList;
import java.util.List;

public class ArrayListStudy {
    public static void main(String[] args) {
        // List<String> list = new ArrayList<>();  // 다형성 - 오로지 상속관계만 가능 //배열 사용
        List<String> list = new LinkedList<>();
        // <String> : 제네릭(Generic), 제한 설정
        // ex) 제한 : `오로지 String 객체 주소값만` 담을 수 있는 컬렉션
        Card card = new Card("", "");
        // list.add(card) // 담기지 않음(String 타입이 아니기 때문에)

        System.out.println("list.size: " + list.size());
        list.add("가");  // 0번방에 "가" 주소값이 들어감
        list.add("나");  // 1번방에 "나" 주소값이 들어감
        list.add(1, "다");   // 1번 방을 지정하고 "다" 주소값을 넣음
        System.out.println("list.size: " + list.size());
        System.out.println("list.get(0): "+ list.get(0));
        System.out.println("list.get(1): "+ list.get(1));

        /*
            오버로딩 (Overloading)
            같은 이름의 메서드를 매개변수만 다르게 해서 여러 개 정의하는 것
            → 이름은 같고, 인자의 수나 타입이 다름

            오버라이딩 (Overriding)
            상속받은 부모 클래스의 메서드를 자식 클래스에서 재정의하는 것
            → 같은 이름 + 같은 매개변수 → 기능만 바꿈

        */
    }
}

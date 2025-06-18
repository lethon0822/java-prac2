package ch07.sec07.poly;

public class AnimalExample02 {
    public static void main(String[] args) {
        // 주소값 instanceof 타입
        // 타입이 주소값을 저장할 수 있는지 물어봄
        // o => true / x => false

        Tiger tiger = new Tiger();
        System.out.println(tiger instanceof Cat);   // true

        Cat cat = tiger; // 자동 형변환

        System.out.println(cat instanceof Tiger);   // true
        // cat 에 tiger 객체의 주소값을 담아서 Tiger로 주소값을 저장할 수 있는지를 봄

        Tiger tiger2 = (Tiger)cat;  // 강제 형변환을 했지만 cat의 객체이기 때문에
        System.out.println(tiger2 instanceof Animal); // true
    }
}

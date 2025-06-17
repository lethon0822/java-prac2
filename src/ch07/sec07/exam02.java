package ch07.sec07;

public class exam02 {

}

class Parent {
    public void method01(){
        System.out.println("Parent-method01");
    }

    public void method02(){
        System.out.println("Parent-method02");
    }
}

class Child extends Parent {
    @Override
    public void method02() {
        System.out.println("Child-method02");
    }

    public void method03() {
        System.out.println("Child-method03");
    }
}
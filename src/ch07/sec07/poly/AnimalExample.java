package ch07.sec07.poly;

public class AnimalExample {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cow cow = new Cow();
        Dog dog = new Dog();
        Tiger tiger = new Tiger();

        animalCrying(cat);
        animalCrying(tiger);
    }

    public static void animalCrying(Animal animal){
        animal.crying();
    }
}

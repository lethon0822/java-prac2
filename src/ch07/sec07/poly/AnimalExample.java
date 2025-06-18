package ch07.sec07.poly;

public class AnimalExample {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cow cow = new Cow();
        Dog dog = new Dog();
        Tiger tiger = new Tiger();
        BullDog bullDog = new BullDog();

        animalCrying(cat);
        animalCrying(cow);
        animalCrying(tiger);
        animalCrying(dog);
        animalCrying(bullDog);

    }

    public static void animalCrying(Animal animal){
        animal.crying();
        if (animal instanceof Dog) {
            Dog dog = (Dog)animal;
            dog.jump();
        }
    }
}

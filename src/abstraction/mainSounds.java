package abstraction;

public class mainSounds {

    public static void main(String[] args){
        Animal animal = new Dog();
        animal.sound();
        Animal animal1 = new Cat();
        animal1.sound();
        animal1.greet();
        animal.greet();
    }
}

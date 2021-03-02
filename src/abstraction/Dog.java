package abstraction;

public class Dog extends Animal {

    @Override
    public void sound() {
        System.out.println("Woof!");
    }

    public void traits(){
        System.out.println("Faithful!");
    }
}

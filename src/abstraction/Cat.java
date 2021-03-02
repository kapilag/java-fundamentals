package abstraction;

import abstraction.Animal;

public class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Meow!!");
    }
}

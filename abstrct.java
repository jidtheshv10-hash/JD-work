abstract class Animal {
    abstract void Sound();

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void Sound() {
        System.out.println("Dog barks");
    }
}

public class abstrct {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.Sound();
        d.eat();
    }
}
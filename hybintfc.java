interface Pet {
    void play();
}

interface Trainable {
    void train();
}

interface Animal {
    void eat();
}

class Dog implements Animal {
    public void eat() {
        System.out.println("Dog is eating");
    }
}

class PetDog extends Dog implements Pet, Trainable {
    public void play() {
        System.out.println("Dog is playing");
    }

    public void train() {
        System.out.println("Dog is training");
    }
}

public class hybintfc {
    public static void main(String[] args) {
        PetDog d = new PetDog();

        d.play();
        d.train();
        d.eat();
    }
}
package CollegePracticals;

public class RuntimePolymorphism {

    public static void main(String[] args) {

        Animal a;

        // Animal reference refers to Dog object
        a = new Dog();
        a.sound();

        // Animal reference now refers to Cat object
        a = new Cat();
        a.sound();
    }
}

// Parent class
class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class 1
class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Child class 2
class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

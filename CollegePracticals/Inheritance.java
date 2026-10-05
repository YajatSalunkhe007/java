package CollegePracticals;

public class Inheritance {
    void eat() {
        System.out.println("This is an animal that eats.");
    }
}

class Animal extends Inheritance {
}

// Single Inheritance
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

// Multilevel Inheritance
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps.");
    }
}

class InheritanceDemo {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat(); // from Animal
        p.bark(); // from Dog
        p.weep(); // from Puppy
    }
}

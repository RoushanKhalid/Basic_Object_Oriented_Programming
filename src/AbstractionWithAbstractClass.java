abstract class Animal {
    abstract void walk();

    public void eat() {
        System.out.println("Animal eats");
    }

    Animal() {
        System.out.println("Animal class constructor");
    }
}

class Horse extends Animal {
    public void walk() {
        System.out.println("Horse walks on 4 legs");
    }

    Horse() {
        System.out.println("Horse class constructor");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("Chicken walks on 2 legs");
    }

    Chicken() {
        System.out.println("Chicken class constructor");
    }
}

public class AbstractionWithAbstractClass {
    public static void main(String[] args) {
        System.out.println("Abstraction With Abstract Class");

        Horse horse = new Horse();
        horse.walk();
        horse.eat();
        Chicken chicken = new Chicken();
        chicken.walk();
        chicken.eat();

    }
}

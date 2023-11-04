public class AbstractionUse {

  // here we are using the abstraction class 
  
    public static void main(String[] args) {

        Horse h = new Horse();
        h.walk();

        Chicken ck = new Chicken();
        ck.walk();

    }

}

abstract class Animal {
    void eat() {
        System.out.println("animal can be eat what they wants ");
    }

    abstract void walk();
}

class Horse extends Animal {
    void walk() {
        System.out.println("Horse can be walk with his 4 legs");
    }

}

class Chicken extends Animal {
    void walk() {
        System.out.println("Chicken cane be walk with his 2 legs ");
    }
}

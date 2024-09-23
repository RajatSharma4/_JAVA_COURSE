public class Data_Abstraction {
    public static void main(String[] args) {
        Horse sc = new Horse();
        sc.walk();
        // Animal-> Dog-> Frog-> Horse 
        // Dog sc = new Dog();
        // sc.bark();
        // sc.eat();
        // System.out.println(sc.color);

        // Horse vd = new Horse();
        // vd.eat();
        // vd.walk();

    }
}

abstract class Animal { // abstract class object does not created into the main function this produce a
                        // kind of error
   // String color;

    Animal() {
       // color = "brown";
       System.out.println("Animal constructor called");
    }

    void eat() { // non abstract function
        System.out.println("eats foot");
    }

   // abstract void walk(); // abstract function
}

class Dog extends Animal {
    Dog(){
        System.out.println("Dog constructor called");
    }
    // void changecolor(){
    //     color = "dark brown";
    // }
    void walk() {
        System.out.println("Walk");
    }
}
class Frog extends Animal{
    Frog(){
        System.out.println("Frog constructor called");
    }
}

 
class Horse extends Animal {
    Horse(){
        System.out.println("Horse constructor called");
    }
    // void changecolor(){
    //     color = "light brown";
    // }
    void walk() {
        System.out.println("Walk very fast");
    }

}
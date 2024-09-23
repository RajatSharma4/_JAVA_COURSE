public class Heirachical_inheritance {
    public static void main(String[] args) {
        Fish sc = new Fish();
        sc.Swim();
        sc.breathe();
        sc.eat();
        
    }
}
class Animal{
    void eat(){
        System.out.println("eats");
    }

void breathe(){
    System.out.println("breathes");
}
}

class Fish extends Animal{
     void Swim(){
        System.out.println("Swims");
     }
}
class Dog{
    void bark(){
        System.out.println("bark");
    }
}

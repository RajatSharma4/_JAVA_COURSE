public class Hybrid_inheritance {
    public static void main(String[] args) {
        Dog sc = new Dog();
        sc.Breathe();
        sc.bark();
        sc.eat();
        sc.bark();
        
    }
}
class Animal{
    void eat(){
        System.out.println("eats");
    }
    void Breathe(){
        System.out.println("Breathe");
    }
}
class Fish extends Animal{
    void Swim(){
        System.out.println("Swim");
    }
}
class Whale extends Fish{
    void big(){
        System.out.println("big");
    }
}
class Shark extends Fish{
    void Long(){
        System.out.println("Long");

    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("bark");
    }
}
class Pitbull extends Animal{
    void Fatty(){
        System.out.println("Fatty");
    }
}
class Rotwillar extends Animal{
    void danger(){
        System.out.println("danger");
    }
}

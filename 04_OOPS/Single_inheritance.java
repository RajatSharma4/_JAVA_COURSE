public class Single_inheritance {
    public static void main(String[] args) {
        Fish whel = new Fish();
        whel.eat();
        whel.eat();
        whel.swim();
        
    }
}

class Animal{
    void eat(){
        System.out.println("eats");
    }
    void bark(){
        System.out.println("bark");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("fish wim");
    }

}

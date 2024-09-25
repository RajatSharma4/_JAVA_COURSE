public class Multi_inheritance {
    public static void main(String[] args) {
        Wall sc = new Wall();
        sc.leg = 2;
        System.out.println(sc.leg);
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

class Wall extends Fish{
    int leg;
}
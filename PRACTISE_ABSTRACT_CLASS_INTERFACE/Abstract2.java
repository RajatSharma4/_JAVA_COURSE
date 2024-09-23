class Monkey{
    void jump(){
   System.out.println("jump");
    }
    void bite(){
      System.out.println("bite");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    void speek(){
        System.out.println("hello sir....");
    }
    @Override
    public void eat(){
        System.out.println("eating....");
    }
    public void sleep(){
        System.out.println("sleeping...");
    }

}
public class Abstract2 {
    public static void main(String[] args) {
        Human h = new Human();
        h.sleep();
        h.bite();
        h.eat();
        h.jump();
        h.speek();

        // polymorphism

        Monkey m = new Human();
      //  m.sleep()---- does not call becouse we can use polymorphism concept 
      m.bite();
      m.jump();
        
    }
}

class A{
    void Man(){
        System.out.println("this is the man of class A ");
    }
}
class B extends A{
    @Override
    void Man(){
        System.out.println("this is the another man in class B");
    }
}
public class Overriding{
    public static void main(String[] args) {
        B van = new B();
        van.Man();
        A nan = new A();
        nan.Man();
        
    }
}
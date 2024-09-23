class Phone{
    public void greet(){
        System.out.println("Namaste");
    }
    public void name(){
        System.out.println("iphone");
    }
}
class Smartphone extends Phone{
    public void call(){
        System.out.println("this method is call method");
    }
    public void name(){
        System.out.println("vivo");
    }
}
public class Dispatch{
    public static void main(String[] args) {
        // Smartphone van  = new Smartphone();
        // van.name();

        Phone obj = new Smartphone();
        obj.greet();
        obj.name();
      //  obj.call(); // not allowed
        // Smartphone obj =new Phone    not allowed

        
    }
}
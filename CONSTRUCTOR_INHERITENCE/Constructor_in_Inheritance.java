class Base {
    Base(){
      System.out.println("i am a constructor");
    }
    Base(int n){
        System.out.println("i am a overlodde constructor"+ n);
    }
}

class Derived extends Base {
    
    Derived(){
       // super(n);
        System.out.println("i am a derived class constructor");
    }
    Derived(int n, int m){
        super(n);
        System.out.println("i am a derived xlass overloaded constructor value of"+m);
    }
}
class childclass extends Derived{
    childclass(int n, int m, int o){
        super(n, m);
        System.out.println("this is the child class of vlaue"+ o);
    }
}
    
public class Constructor_in_Inheritance {
    public static void main(String[] args) {
        // Base vab = new Base();
        // Derived d = new Derived();
        // Derived d = new Derived(24, 33);
        childclass c = new childclass(23, 33,43);



    }
}


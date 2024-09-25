abstract class Parent{
    public Parent(){
        System.out.println("i am the parent constructor");
    }
    public void sayHello(){
        System.out.println("hello");
    }
    abstract public void greet();    
    abstract public void greet1();    

}
class Child2 extends Parent{
    @Override
    public void greet(){
        System.out.println("good mornung ");
    }
    @Override
    public void greet1(){
        System.out.println("good afternoon");
    }

}
abstract class Child3 extends Parent{
    public void th(){
        System.out.println("hello world ");
    }
    
}
public class Abstract_Basic{
    public static void main(String[] args) {
       // Parent p = new Parent();------ throw an error
       @SuppressWarnings("unused")
    Child2 c = new Child2();
    //    Child3 b = new Child3();------ it can also throw an error
       

        
        
    }
}
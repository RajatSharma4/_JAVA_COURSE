interface Demoanomy{
    void meth1();
    void meth2();
}
class Anonydemo implements Demoanomy{
    public void display(){
        System.out.println("hello");
    }
    @Override
    public void meth1(){
        System.out.println("i am meth1");

    }
    public void meth2(){
        System.out.println("i am meth2");
    }
    }
public class Anonymous_lambda{
  
    
    public static void main(String[] args) {
        // Demoanomy obj = new Anonydemo();
        // obj.meth1();

        Demoanomy obj = new Demoanomy() {
            public void meth1(){
           System.out.println("meth1");
            }
            public void meth2(){
            System.out.println("meth2");
            }
        };
        obj.meth1();
        
        
    }
}
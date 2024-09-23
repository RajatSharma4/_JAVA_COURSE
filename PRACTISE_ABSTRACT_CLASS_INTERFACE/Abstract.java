abstract class pen{
    abstract void write();
    abstract void refil();
}
class FountainPen extends pen{
    void write(){
  System.out.println("write");
    }
    void refil(){
     System.out.println("refil");
    }
    void changethenib(){
        System.out.println("changing the nib");
    }
}
public class Abstract{
    public static void main(String[] args) {
        FountainPen f= new FountainPen();
        f.write();
        f.refil();
        f.changethenib();

        
    }
}
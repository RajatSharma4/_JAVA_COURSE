abstract class Myclass{
    abstract void show();
    abstract void display();

}
class Another extends Myclass{
    void show(){
        System.out.println("this is the show method of base class ");
    }
    void display(){
        System.out.println("this is the method of display of the base class");
    }
}
public class Abstract_keyword {
    public static void main(String[] args) {
        Another ob = new Another();
        ob.display();
        ob.show();
        
    }
    
}

class base{
    int x;

    public int getX(){
   return x;
    }
    public void setX(int x){
        this.x = x;
    }
    public void printMe(){
        System.out.println("i am a constructor");
    }
}

class Derived extends base{
    int y;

    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }

    public void printThat(){
        System.out.println("this is the derived class of the inheritence");
    }
}
public class Inheritance{
    public static void main(String[] args) {
        Derived sc = new Derived();
        sc.printThat();
        sc.printMe();
    }
}
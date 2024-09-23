class Circle{
    public int radius;
    Circle(){
        System.out.println("i am non parametries constructor");
    }
    Circle(int r){
        System.out.println("i am an parametrise constructor");
         this.radius = r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder extends Circle{
    public int height;
    Cylinder(int r, int h){
        // super(r);
        System.out.println("this is the cykinder constructor");
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }

}
public class Cylindr_in_Circle{
    public static void main(String[] args) {
       // Circle c = new Circle(12);
        Cylinder m = new Cylinder(12, 22);
        
    }
}
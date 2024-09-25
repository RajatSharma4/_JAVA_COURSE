class Cylinder{
    private int Radius;
    private int Height;
 
    //it is a constructor
 
    public Cylinder(int Radius, int Height){
    this.Radius = Radius;
    this.Height = Height;
    }
 
 
    
 
 
 public void setRadius(int Radius){
     this.Radius = Radius;
 }
 public int getRadius(){
     return Radius;
 }
 public void setHeight(int Height){
     this.Height = Height;
     
 }
 public int getHeight(){
     return Height;
 }
 public double surfaceArea(){
     return 2*3.14*Radius*Height + 2*3.14*Radius*Radius;
 }
 public double volume(){
    return 3.142*Radius*Radius*Height;
 }
 }

 //problem 4
 class Rectangle{
    private int length;
    private int breadth;

    public Rectangle(){
        this.length = 4;
        this.breadth = 5;

    }
    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;

 }
 public int getlength(){
    return length;

 }
 public int getbreadth(){
    return breadth;
 }
}
public class Calc_Surfacearea_valume_cylinder {
    
    public static void main(String[] args) {

        //problem no 3
        Cylinder sc = new Cylinder(9, 12);
       // sc.setHeight(12);
        System.out.println(sc.getHeight());
       // sc.setRadius(9);
        System.out.println(sc.getRadius());

        //problem no 2
        System.out.println(sc.surfaceArea());
        System.out.println(sc.volume());

        //problem 4
        Rectangle r = new Rectangle(12, 56);
        System.out.println(r.getlength());
        System.out.println(r.getbreadth());

        
    }
    
}

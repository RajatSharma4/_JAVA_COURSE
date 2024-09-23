class Cylinder{
   private int Radius;
   private int Height;

   //it is a constructor

   //public Cylinder(int Radius, int Height){
  //  this.Radius = Radius;
   // this.Height = Height;


   


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
// public double surfaceArea(){
//     return 2*3.14*Radius*Height + 2*3.14*Radius*Radius;
// }
}
public class Radius_Height{
    public static void main(String[] args) {

        //problem no 1
        Cylinder sc = new Cylinder();
        sc.setHeight(12);
        System.out.println(sc.getHeight());
        sc.setRadius(9);
        System.out.println(sc.getRadius());
    //    sc.setHeight(10);
    //    System.out.println(sc.getHeight());
    //    sc.setRadius(5);
    //    System.out.println(sc.getRadius());
    //    System.out.println(sc.surfaceArea());
    //     // sc.getHeight(0);
        // sc.getRadius(0);
        
    }
}
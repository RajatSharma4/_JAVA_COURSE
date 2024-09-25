import static java.lang.Math.*;
public class Area {
    public void Circle(double r){
        double Area = PI*r*r;
        System.out.println("The Area of circle is : " + Area);
    }
    public static void main(String[] args) {
        Area a = new Area();
        a.Circle(2.3);
        
    }
    
}

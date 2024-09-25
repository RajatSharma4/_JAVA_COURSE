interface Area{
    final static float PI = 3.14f;
    float compute(float x, float y);
}
class Rectangle implements Area{
    public float compute(float x, float y){
        return (x*y);
    }
}
class Circle implements Area{
    public float compute(float x, float y){
        return (PI*x*x);
    }
}
public class Interfacetest{
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Circle cir = new Circle();
        Area area;
        area = rect;
        System.out.println("Area of Ractangle is = " +area.compute(10, 20));
        area = cir;
        System.out.println("Area of Circle is = " +area.compute(10, 0));
        
    }
}
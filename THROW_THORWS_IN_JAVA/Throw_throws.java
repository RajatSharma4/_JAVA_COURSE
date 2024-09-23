class NegativeradiusException extends Exception{
    @Override
    public String toString(){
        return "Radius cannot be negative";
    }
    public String getMessage(){
        return "Radius cannot be negative";
    }
}
public class Throw_throws{
    public static double area(int r) throws NegativeradiusException{
        if(r<0){
            throw new NegativeradiusException();
        }
        double result =  Math.PI*r*r;
        return result;

    }
    public static int divide(int a, int b) throws ArithmeticException{
        //made by harry
        int result = a/b;
        return result;
    }
 public static void main(String[] args) {
    try{
        int c = divide(6, 3);
        System.out.println(c);
        // double a = area(6);
        // System.out.println(a);
    }
    catch(Exception e){
        System.out.println("exception");
    }
    
 }
}
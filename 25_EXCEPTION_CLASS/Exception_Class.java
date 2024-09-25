import java.util.Scanner;
class Myexception extends Exception{
    @Override
    public String toString() {
        return  "i am toString()";
    }
      public String getMessage(){
        return "i am a getMesaage()";
        
      }
}
public class Exception_Class{
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a<9){
           try{
           // throw new Myexception();
           throw new ArithmeticException("i am another exception");
           }
           catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            System.out.println(e);
            e.printStackTrace();
           }
        
        }
        sc.close();
}
}
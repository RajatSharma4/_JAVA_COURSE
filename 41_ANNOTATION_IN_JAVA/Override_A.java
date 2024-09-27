@FunctionalInterface   // --- it can use to use one method within the class we can't implement multiple methods into the class 
interface functionlInterface{
    void thisMethod();

}
class Phone{
    public void show(){
        System.out.println(" it is 8pm");
    }
}
class newPhone extends Phone{
  //  @Override ---- IT show that the methods are overide
    public void show(){
        System.out.println("it is 8PM");
    }
    @Deprecated
    public int sum(int a, int b){
       return a+b;
    }
}
public class Override_A{
  @SuppressWarnings("Deprecation")   // --It can use to ignore the warning of compilor
    public static void main(String[] args) {
        newPhone n = new newPhone();
        n.show();
        n.sum(4, 6);
        
    }
}
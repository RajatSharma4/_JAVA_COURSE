class Rectangle1{
   int l,w;
   void getdata(int a, int b){
    l=a;
    w=b;
   }
   int area(){
    return(l*w);
   }
}
public class Rectangle {
    public static void main(String[] args) {
        Rectangle1 r1 = new Rectangle1();
        Rectangle1 r2 = new Rectangle1();
        r1.getdata(20, 30);
        r2.getdata(10, 20);
        System.out.println("area of the first rectangle = "+ r1.area());
        System.out.println("area of the second rectangle = "+ r2.area());
    
        
    }
}

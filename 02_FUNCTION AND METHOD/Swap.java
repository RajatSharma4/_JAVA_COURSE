public class Swap {
    public static void swap(int a, int b){
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("value of a is: " +a);
        System.out.println("value of b is: " +b);

    }
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        swap(a, b);
      
       
        
    }
    
}

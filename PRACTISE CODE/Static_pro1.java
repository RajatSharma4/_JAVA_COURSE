
public class Static_pro1 {
    static int count;
    public Static_pro1(){
        count++;
    }
    static int display_count(){
        return count;
    }
    public static void main(String[] args) {
        Static_pro1 ob1 = new Static_pro1();
        Static_pro1 ob2 = new Static_pro1();
        Static_pro1 ob3 = new Static_pro1();
        Static_pro1 ob4 = new Static_pro1();
        Static_pro1 ob5 = new Static_pro1();
        System.out.println("total objects created = " + Static_pro1.display_count());

         
        
    }
}

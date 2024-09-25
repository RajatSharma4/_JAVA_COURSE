public class Static_pro2 {
    static int a =3;
    static int b;
    static void st_fun(int x){
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    static{
        System.out.println("Initialization of static");
       
        b=a*4;
    }
    public static void main(String[] args) {
        st_fun(33);
        
    }
    
}

class A{
    int da;
    A(){
        System.out.println("Constructor of A class");
    }
    A(int a){
        da = a;
        System.out.println("Parametrised constructor of A class");
    }
}
class B extends A{
    int db;
    B(){
        System.out.println("Constructor of B class");
    }
    B(int a, int b){
        super(a);
        db=b;
        System.out.println("Parametrised constructor of B class");
    }
}
class C extends B{
    int dc;
    C(){
        System.out.println("COnstructor of C class");
    }
    C(int a, int b, int c){
      super(a,b);
      dc = c;
      System.out.println("Parametrised constructor of C class");
    }
}
public class Super {
    public static void main(String[] args) {
        C ob = new C(2, 3, 4);
        
    }
    
}

@FunctionalInterface
interface Lambda{
    void meth1();

}

// class Harryfun implements Lambda{
//    public void meth1(){
//        System.out.println("This is method");
//     }
// }
public class Lambda_expression {
    public static void main(String[] args) {
        // Lambda ob = new Harryfun();
        // ob.meth1();

        Lambda obj = ()->{
            System.out.println("i am meth");
        };
        obj.meth1();
        
    }
    
}

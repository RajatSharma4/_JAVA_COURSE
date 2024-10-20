// public class Average {
//     public static void Average3(int a, int b, int c){
//         int Avg = (a+b+c)/3;
//         System.out.println(Avg);
//     }
//     public static void main(String[] args) {
//        int a = 20;
//        int b = 30;
//        int c = 40;
//        Average3(a, b, c);

        
//     }
    
// }
class Test{
    Object show(){
        System.out.println("1");
        return null;
    }
}
class Xyz extends Test{
    String show(){
        System.out.println("2");
        return null;
    }
}
public class Average{
    public static void main(String[] args) {
        Test t = new Test();
        t.show();
        
    }
}


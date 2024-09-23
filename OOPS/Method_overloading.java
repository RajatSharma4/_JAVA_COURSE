public class Method_overloading {
    public static void main(String[] args) {
        Calculator sc = new Calculator();
        System.out.println(sc.sum(2, 5));
        System.out.println(sc.sum(3.0f, 5.0f));
        System.out.println(sc.sum(23, 44, 22));
        
    }
}
class Calculator{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}
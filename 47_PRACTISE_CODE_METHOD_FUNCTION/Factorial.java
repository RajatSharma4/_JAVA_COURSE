public class Factorial{
    public static int Fact(int n){
        int f = 1;
        for(int i = 1; i<=n; i++){
            f = f*i;
        }
        return f;
    }
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Factorial sc = new Factorial();
        System.out.println(sc.Fact(4));
        
    }
}
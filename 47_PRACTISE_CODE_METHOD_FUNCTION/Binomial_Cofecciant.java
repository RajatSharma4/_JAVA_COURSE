public class Binomial_Cofecciant {
    public static int Fact(int n){
        int f = 1;
        for(int i = 1; i<=n; i++){
            f = f*i;
        }
        return f;
    }
public static int BinomialCoe(int n, int r){
    int fact_n = Fact(n);
    int fact_r = Fact(r);
    int fact_nmr = Fact(n-r);

    int Result = fact_n/(fact_r*fact_nmr);
    return Result;
}
    public static void main(String[] args) {
      //  Binomial_Cofecciant sc = new Binomial_Cofecciant();
      System.out.println(BinomialCoe(5, 2));
       
        
    }
    
}

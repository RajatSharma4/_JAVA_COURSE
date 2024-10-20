public class PrimeNo{
    // public static boolean CalcPrime(int n){
    //     for(int i = 2; i<=n-1; i++){
    //         if( n%1 == 0 && n%n == 0){
    //             return true;  
    //         }
    //     }
    //     return false;
    // }
    public static boolean CalcPrime(int n){
        if(n == 2){
            return true;
        }
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }

        }
        return true;
    }
    public static void isPrime(int n){
        for(int i=2; i<=n; i++){
            if(CalcPrime(i)){  

                System.out.print(i+ " "); 
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
      //  System.out.println(CalcPrime(7));
      isPrime(20);
        
    }
}
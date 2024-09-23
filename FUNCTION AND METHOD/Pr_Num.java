public class Pr_Num {
    public static boolean isPrime(int n){
//corer cases
//2
if(n == 2){
    return true;
}

        for(int i = 2; i<=n-1; i++){
            if(n%i == 0){
                return false;
            }
            }
            return true;
        }


          // optimize loop

           public static boolean isPrime1(int n){
            for(int i = 2; i<=Math.sqrt(n); i++){
                if(n%i == 0){
                    return false;
                }
            }
            return true;
           }
          
        // prime number in between range

        public static void primeInRange(int n){
            for(int i = 2; i<=n; i++){
                if(isPrime(i)){
              System.out.println(i+ "");
                }
            }
            System.out.println(" ");
        }

    public static void main(String[] args) {
    primeInRange(20);
    isPrime(5);
       
        
    }
}

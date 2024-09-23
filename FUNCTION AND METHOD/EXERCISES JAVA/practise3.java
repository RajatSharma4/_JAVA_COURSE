
public class practise3 {
    //problem 1 method
    static void multiplication(int n){
        for(int i=1; i<=10; i++){
            System.out.format("%d X %d = %d\n",n,i,n*i);
        }
    }
    //problem 2 and 4 method
    static void pattern5(int n){
        for(int i=n; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //problem 3 method
    static int sumRec(int n){
        if(n==1){
            return 1;

        }
            return n + sumRec(n-1);
    }
    //problem 5 method
    static int fib(int n){
       /*  if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;

        }*/
        if(n==1 || n==2){
            return n-1;
        }
        else{
            return fib(n-1) + fib(n-2);
        }
    }
    //method problem 6
    static float average(int ...arr){
        float result =0;
        for(float a: arr){
            result = result+a/2;
        }
        return result;
    } 
    //problem method 7
    static void pattern5_rec(int n){
       if(n>0){
        pattern5_rec(n-1);
        for(int i=0; i<n; i++){
            System.out.print("*");

       }
       System.out.println();
    }
    }
    //pattern_rec(3)
    //pattern_rec(2) + 3 times star and new line
    //pattern_rec(1) + 2 times star and new line + 3 times star and new line
    //pattern_rec(0) + 1 times star and new line + 2 times star and new line + 3 times star and new line
    
    public static void main(String[] args) {
        //problem 1
       // multiplication(6);

        //problem no2
      // pattern5(4);

      //problem n03
     //int c = sumRec(5);
     //System.out.println(c);

     //problem no4
     //pattern5(4);

     //problem no5
     //fibonacci series 0,1,1,2,3,5,8,13.......
    // int result = fib(10);
     //System.out.println(result);

     //problem no 6
     //System.out.println("the average of 4,5and 6 is: " + average(4,5,6));
     //System.out.println("the average of 6,5,9 and 3is: " + average(6,5,9,3));

     //problem no 7
     pattern5_rec(6);

    

    
    }
    
}

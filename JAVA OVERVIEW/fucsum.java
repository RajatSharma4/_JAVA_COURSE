import java.util.Scanner;
public class fucsum {
//public static int calculatesum(int a, int b){
       // int sum = a+b;
      //  return sum;
  //  }

  public static void printFactorial(int n){
    //loop
    if(n<0){
        System.out.println("invalid");
        return;
    }
   int Factorial = 1;
    for(int i=n; i>=1; i--){
        Factorial = Factorial*i;

    }
    System.out.println(Factorial);
    return;

  }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = sc.nextInt();
        printFactorial(n);



       // System.out.println("enter the second number: ");
       // int b = sc.nextInt();


      //   System.out.println("the sum of a and b is: ");
      //  int sum = calculatesum(a, b);
       // System.out.println(sum);
        
    }
    
}

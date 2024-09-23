import java.util.Scanner;
public class Fsum{
    public static void calculatesum(int a, int b){  // parameter or formal parameter
        int sum = a+b;
        System.out.println("Sum is: " +sum);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int a = sc.nextInt();
        System.out.print("Enter the second number :");
        int b = sc.nextInt();
        calculatesum(a, b);  // arguement actual parameters
        sc.close();
        
    }
    
}

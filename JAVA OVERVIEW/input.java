import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        System.out.println("taking two number input from the user :");4
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number: ");
        int a = sc.nextInt();
        System.out.println("enter the second number: ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("The sum of two number is : ");
        System.out.println(sum);
sc.close();
    }
   

    
}
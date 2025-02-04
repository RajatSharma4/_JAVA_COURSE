import java.util.Scanner;
public class Arstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int originalNum, result = 0, remainder;
        originalNum = num;
        while(originalNum!=0){
            remainder = originalNum%10;
            result = (int) (result+Math.pow(remainder, 3));
            originalNum = originalNum/10;

        }
        if(result == num){
            System.out.println(num + " is an Armstrong number: ");
        }
        else{
            System.out.println(num+" is not Armstrong number: ");
        }
        sc.close();
        
    }
    
}

import java.util.Scanner;
public class PalindromeNo {
    public static boolean isPal(int n){
        int palindrome = n;
        int reverse  = 0;

        while(palindrome!=0){
            int remainder  = palindrome%10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome/10;
            return true;
        }
        return false;
    
    }

    public static void main(String[] args) {
        System.out.println("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        int palindrome = sc.nextInt();
        if(isPal(palindrome)){
            System.out.println("number " + palindrome + " is a palindrome number");
        }else{
            System.out.println("number " + palindrome + " is a not palindrome number");
        }
        
    }
}

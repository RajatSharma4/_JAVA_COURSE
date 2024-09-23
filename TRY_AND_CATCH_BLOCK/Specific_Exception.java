import java.util.Scanner;
public class Specific_Exception {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 34;
        marks[1] = 23;
        marks[2] = 33;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Array index");
        int ind = sc.nextInt();
        System.out.println("enter the number u want to divide");
        int number = sc.nextInt();
        try{
            System.out.println("The value of array index entered is : " + marks[ind]);
            System.out.println("the value of array-value/number is: " +marks[ind]/number);

        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException ocured!");
        
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occurs");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("some other exception occurs");
            System.out.println(e);
        }
        sc.close();


    }
    
}

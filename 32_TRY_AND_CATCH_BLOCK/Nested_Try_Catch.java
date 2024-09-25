import java.util.Scanner;
public class Nested_Try_Catch {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 34;
        marks[1] = 23;
        marks[2] = 33;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag){
        System.out.println("Enter the value of index");
        int ind = sc.nextInt();
        try{
            System.out.println("Welcome to the video no 82");
            try{
                System.out.println(marks[ind]);
                flag = false;
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("sorry this index does not exist");
                System.out.println("exception is level 2");
                
            }
        }
        catch(Exception e){
            System.out.println("exception is level 1");
        }
    }
        sc.close();
    }
    
}

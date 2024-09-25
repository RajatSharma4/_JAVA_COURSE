import java.util.Scanner;
public class Error{
    public static void main(String[] args) {

        //problem 1

       // int a = 10   ---- it is an syntax error
    //    int age = 76;
    //    int Born_year = 2000-76;    ----- this is an logical error

    //System.out.println(6/0);   -------- exception

    //problem 2

        //  try{
        //     System.out.println(333/0);
        //  }
        //  catch(IllegalArgumentException e){
        //     System.out.println("haha");
        //  }
        //  catch(ArithmeticException e){
        //     System.out.println("hehe");
        //  }

        //problem 2

        boolean flag = true;
        int [] marks = new int[3];
        marks[0] = 23;
        marks[1] = 44;
        marks[2] = 55;
        Scanner sc = new Scanner (System.in);
        int index;
        int i =0;
        while(flag && i<5){
            try{
               System.out.println("Enter the value of index");
                index = sc.nextInt();
                System.out.println("the value of marks[index] is " + marks[index]);
                break;
            }
            catch(Exception e){
                System.out.println("Invalid index");
                i++;
            }
        }
        sc.close();
       

    }
}
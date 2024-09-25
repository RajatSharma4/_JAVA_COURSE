import java.util.Scanner;

public class per {
    public static void main(String[] args) {
        Scanner Sc =new Scanner(System.in);
        System.out.println("Enter marks of Physics: ");
        float Physics =Sc.nextFloat();
        System.out.println("Enter marks of Chemistry:  ");
        float Chemistry =Sc.nextFloat();
        System.out.println("Enter marks of Maths: ");
        float Maths =Sc.nextFloat();
        System.out.println("Enter marks of English: ");
        float English =Sc.nextFloat();
        System.out.println("Enter marks of Hindi: ");
        float Hindi =Sc.nextFloat();
         System.out.println("Percentage is: ");

        float Total =((Physics+Chemistry+Maths+English+Hindi)/500.0f)*100;
       
        System.out.println(Total);
    }
        

    }

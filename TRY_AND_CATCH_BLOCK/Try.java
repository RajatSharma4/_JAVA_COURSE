public class Try{
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;  // Arithmetic exception 
        try{
            
            int c = a/b;
            System.out.println("The Result is  " + c);
        }
        catch(Exception e){
            System.out.println("we failed to divide the given number / by zero");
            System.out.println(e);
        }
        System.out.println("End of the program");
        

    }
}
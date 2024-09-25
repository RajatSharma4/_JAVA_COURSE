public class Finally_block{
    public static int greet(){
        try{
            int a = 50;
            int b = 2;
            int c = a/b;
            return c;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{

            System.out.println("this is the end of the program");
        }
        return 0;

    }
    public static void main(String[] args) {
    //   int k =   greet();
    //   System.out.println(k);
    int b = 7;
    int a = 9;
    while(b>0){
        try{
            System.out.println(b/a);
        }
        catch(Exception e){
            System.out.println(e);
            break;
        }
        finally{
            System.out.println("i am exit b = " + b);
        }
        b--;
    }
    try{
        System.out.println(50/10);
    }
    finally{
        System.out.println("yes it is possible");
    }
      
    }
}
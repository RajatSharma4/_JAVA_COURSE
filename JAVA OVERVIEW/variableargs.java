public class variableargs {
    static int sum(int ...arr){
        //avialable an int [] arr
        int result=0;
        for(int a: arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("welcome to the variable tutorial:");
        System.out.println("the sum of nothjing is: " + sum());
        System.out.println("the sum of 1 is: " + sum( 1));
        System.out.println("the sum of 3 and 4 is: " + sum(4, 5));
        System.out.println(" the sum of 4,7 and 8 is: " + sum(4, 7, 8));

    }
    
}

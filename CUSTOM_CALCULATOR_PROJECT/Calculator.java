class InvalidInputException extends Exception{
    @Override
    public String toString(){
        return "Cannot add 8 and 9";
    }
    public String getMessage(){
        return "Radius cannot be negative";
    }
}
class CannotDivideBYZeroException extends Exception{
    @Override
    public String toString(){
        return "Cannot divide BY zero";
    }
    public String getMessage(){
        return "Radius cannot be negative";
    }
}
class MaxInputException extends Exception{
    @Override
    public String toString(){
        return "Input can't be greater than 1000";
    }
   
}
class MaxMultiplyInputException extends Exception{
    @Override
    public String toString(){
        return "Input can't be greater than 7000 while multiplying";
    }
   
}
public class CustomCalculator{
    double add(double a, double b) throws InvalidInputException, MaxInputException{
        if(a>1000 || b>1000){
            throw new MaxInputException();
        }
        if(a==8 || a==9){
            throw new InvalidInputException();
        }
        return a+b;
    }
    double sub(double a, double b)throws MaxInputException{
        if(a>1000 || b>1000){
            throw new MaxInputException();
        }
        return a-b;
    }
    double mult(double a, double b) throws MaxInputException,  MaxMultiplyInputException{
        if(a>1000 || b>1000){
            throw new MaxInputException();
        }
        else if(a>7000 || b>7000){
            throw new MaxMultiplyInputException();
        }
        return a*b;
    }
    double div(double a, double b) throws CannotDivideBYZeroException, MaxInputException{
        if(a>1000 || b>1000){
            throw new MaxInputException();
        }
       if(b==0){
        throw new CannotDivideBYZeroException();
       }
        return a/b;
    }
}
public class Calculator{
    public static void main(String[] args) throws InvalidInputException, CannotDivideBYZeroException, MaxInputException,  MaxMultiplyInputException{
        CustomCalculator c = new CustomCalculator();
      // System.out.println(c.add(8, 9)); 
    //   c.div(60000, 3);
       c.mult(5, 300000000);
        
    }
}
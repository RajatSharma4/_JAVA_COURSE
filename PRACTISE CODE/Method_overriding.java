class Student1{
    protected int roll, marks;
    private String name;

    Student1(){

    }
    Student1(int a, int b, String nm){
        roll = a;
         marks = b;
         name = nm;
    }
    void display(){
        System.out.println("Roll " + roll + "\nName " + name + "\nMarks " + marks);
    }
}
 class Result1 extends Student1{
    private int sp_marks;
    Result1(){

    }
    Result1(int a, int b, String s, int m){
        super(a,b,s);
        sp_marks = m;

    }
    void display(){
        super.display();
        System.out.println("Total marks are    "+ get_Total());
    }
    int get_Total(){
        return(sp_marks+marks);
    }

}
public class Method_overriding {
    public static void main(String[] args) {
        Result1 s1 = new Result1(5,400,"Rajat",300);
        s1.display();
        
    }
    
}

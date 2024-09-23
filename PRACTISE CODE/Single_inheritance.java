class student1{
    protected int roll, marks;
    private String name;

    student1(){}
    student1(int a, int b, String nm){
        roll = a;
        marks =b;
        name = nm;
    }
    void display(){
        System.out.println("Roll number "+ roll+ "\nName "+ name + "\nmarks"+ marks);
    }
}
public class result extends student1{
    private int sp_marks;
    result(){

    }
    result(int a, int b, String s, int m){
        super(a,b,s);
        sp_marks = m;
    }
    int gettotal(){
        return(sp_marks + marks);
    }
}
public class Single_inheritance {
    public static void main(String[] args) {
        result ob = new result(3, 400, "Rajat", 200);
        ob.display();
        System.out.println("total marks are  " +  ob.gettotal());

        
    }
}

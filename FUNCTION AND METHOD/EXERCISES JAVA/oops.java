class employee{
    int id;
    int salary;
    String name;

    public void printdetails(){
        System.out.println("my id is " + id);
        System.out.println("my salary is " + salary);
        System.out.println("my name is " + name);
    }
    public int getsalary(){
        return salary;
    }

}
public class oops {
    public static void main(String[] args) {
        System.out.println("this is our custom class ");
        employee harry = new employee();
        employee rajat = new employee();

        //setting attributes for harry
        harry.id = 12;
        harry.salary = 36;
        harry.name = "codewithharry";

        //setting attributes for rajat

        rajat.id = 13;
        rajat.salary = 64;
        rajat.name = "codewithrajat";

        //printing the attributes

        harry.printdetails();
        rajat.printdetails();
        int salary = harry.getsalary();
        int salaryi = rajat.getsalary();
        // System.out.println(salary);
        // System.out.println(salaryi);


    }
    
}

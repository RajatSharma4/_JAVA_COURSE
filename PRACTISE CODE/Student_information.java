class Student{
    //data
    int em_no, marks;
    String name;

//method
void getdata(int no, int m, String nm){
     em_no = no;
     marks = m;
     name = nm;
}
void putdata(){
    
    System.out.println("Enrollment number = " + em_no + "Marks  = "+ marks + "Name = "+ name);
}
}
public class Student_information{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.getdata(23, 500, "Rajat");
        s2.getdata(23, 222, "vaibhav");
        s1.putdata();
        s2.putdata();
        
    }
}
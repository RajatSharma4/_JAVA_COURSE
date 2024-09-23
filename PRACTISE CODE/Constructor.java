class Student{
    int em_no, marks;
    String name;
    //constructor

    Student(){
        System.out.println("defoult constructor invoked");
    }
    Student(int r){
        em_no = r;
        System.out.println("constructor with one arguement");
    }
    Student(int no , int m, String nm){
        em_no = no;
        marks = m;
        name = nm;
        System.out.println("constructor with three arguement ");
    }
    void putdata(){
        System.out.println("Enrollment number = " + em_no + "Marks  = "+ marks + "Name = "+ name);
    }
}
public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(44);
        Student s3 = new Student(22, 200, "Raaj");
        
        
    }
}

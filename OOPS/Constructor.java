public class Constructor {
    public static void main(String[] args) {
        Student sc = new Student();
        sc.name = "rajat";
        sc.rollno = 123;
        sc.password = "233";
        Student sc1 = new Student(sc);
        sc1.password = "abnc";
        //Student sc1 = new Student("vaibhav");
        //Student sc2 = new Student(123);
      //  System.out.println(sc);
        
    }
}

class Student{

    //non parametries constructor
    String name;
    int rollno;
    String password;

    //copy constructor
    Student(Student sc1){
        this.name = sc1.name;
        this.rollno = sc1.rollno;
    }
    Student(){
        System.out.println("hello world");
    }

        //parametries constructor
        Student(String name){
            this.name = name;

        }
        Student(int rollno){
            this.rollno = rollno;
        }

    
}
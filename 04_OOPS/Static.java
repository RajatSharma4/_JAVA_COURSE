public class Static {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolname = "JVM";
        Student s2 = new Student();
        System.out.println(s2.schoolname);

        Student s3 = new Student();
        s3.schoolname = "MBA";

    }
}

class Student {
    String name;
    int roll;

    static String schoolname;

    void setname(String name) {
        this.name = name;
    }

    String getname() {
        return this.name;
    }
}

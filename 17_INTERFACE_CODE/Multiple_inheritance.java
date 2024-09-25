class Student{
    int rollNumber;
    void getNUmber(int n){
        rollNumber = n;
    }
    void putNumber(){
        System.out.println("Roll no : " + rollNumber);
    }
}
class Test extends Student{
    float part1, part2;
    void getMarks(float m1, float m2){
        part1 = m1;
        part2 = m2;
    }
    void putMarks(){
        System.out.println("Marks obtained ");
        System.out.println("Part 1 = " + part1);
        System.out.println("Part 2 = " + part2);
    }
}
interface Sport{
    float sportWt = 6.0f;
    void putWt();
}
class Result extends Test implements Sport{
    float Total;
    public void putWt(){
        System.out.println("Sports Wt = " +  sportWt );
    }
    void display(){
        Total = part1 + part2 + sportWt;
        putNumber();
        putMarks();
        putWt();
        System.out.println("Total score = " + Total);
    }

}
public class Multiple_inheritance {
    public static void main(String[] args) {
        Result s1 = new Result();
        s1.getNUmber(2345);
        s1.getMarks(27.53f, 33.0f);
        s1.display();
        
    }
    
}

import java.util.ArrayList;
import java.util.HashSet;

public class Practise_1{
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        @SuppressWarnings("rawtypes")
        ArrayList ar = new ArrayList<>();
        ar.add("Student 1");
        ar.add("Student 1");
        ar.add("Student 1");
        ar.add("Student 1");
        ar.add("Student 1");
        ar.add("Student 1");
        ar.add("Student 1");
        for (Object o : ar) {
            System.out.println(o);
        }
        HashSet<Integer> s = new HashSet<>();
        s.add(4);
        s.add(7);
        s.add(9);
        s.add(3);
        s.add(4);
        System.out.println(s);
    }
}
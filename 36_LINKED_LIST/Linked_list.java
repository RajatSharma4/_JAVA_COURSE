import java.util.*;

public class Linked_list{
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(20);
        l2.add(29);
        l2.add(23);
        l1.add(3);
        l1.add(5);
        l1.add(4);
        l1.add(8);
        l1.add(7);
        l1.addLast(22);
        l1.add(0, 9);
        l1.addAll(l2);
        System.out.println(l1.contains(1));
        System.out.println(l1.indexOf(3));
        for(int i = 0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}
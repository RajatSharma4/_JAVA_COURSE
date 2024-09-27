import java.util.ArrayList;

class Mygeneric<T1>{
    int val;
    private T1 t1;

    public Mygeneric(int val, T1 t1){
        this.val = val;
        this.t1 = t1;
    }
    public int getval(){
        return val;
    }
    public void setval(int val){
        this.val = val;
    }
    public T1 geT1(){
        return t1;
    }
    public void setT1(T1 t1){
        this.t1 = t1;
    }
}
public class Generic{
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        arrayList.add(33);
        arrayList.add(44);
        int a = arrayList.get(1);
        System.out.println(a);

        Mygeneric<String> G1  = new Mygeneric(23,"vab");
        String b = G1.geT1();
        System.out.println(b);

    }
}
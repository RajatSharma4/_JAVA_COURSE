class firstclass{
    int fr_data; // as defoult
    private int pr_data;  // as private data
    void setdata(int a, int b){
        fr_data = a;
        pr_data = b;
        
    }
    int getdata(){
        return pr_data;
    }
}
class secondclass extends firstclass{
    int total;
    void sum(){
        total = fr_data+getdata();
    }
}
public class Inheritance {
    public static void main(String[] args) {
        secondclass ob = new secondclass();
        ob.setdata(100, 200);
        ob.sum();
        System.out.println("total is " + ob.total);
        
    }
}

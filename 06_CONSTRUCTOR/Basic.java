class MyEmployee{
    private int id;
    private String name;

    // public MyEmployee(){ //method name are same as class namee
    //      id = 45;
    //     name = "Rajat";
    // }
    public MyEmployee(String Myname){ //method name are same as class namee
        id = 45;
       name = Myname;
   }

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id; 
    }
}
public class Basic{
    public static void main(String[] args) {
        MyEmployee man  = new MyEmployee("CodewithRajat");
        System.out.println(man.getId());
        System.out.println(man.getName());
        
    }
}
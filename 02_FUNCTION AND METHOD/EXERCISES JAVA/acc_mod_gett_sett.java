class employee{
    private int id;
    private String name;

    public String getname(){
        return name;
    }
    public void setname(String n){
        name = n;
    }
    public int getid(){
        return id;
    }
    public void setid(int i){
        id = i;
    }
}

public class acc_mod_gett_sett {
    public static void main(String[] args) {

        employee vaibhav = new employee();
        vaibhav.setname("codewithrajat");
        System.out.println(vaibhav.getname());
        vaibhav.setid(34);
        System.out.println(vaibhav.getid());
    }
    
}

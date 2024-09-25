
//total abstraction is used in interface
//multipe inheritance is used in interface 
public class Inter_mult_inhe {
    public static void main(String[] args) {
        beer sc = new beer();
        sc.grass();
        
    }
}
interface hernivorus{
    void grass();
}
interface carnivorus{
    void meat();

}
class beer implements hernivorus, carnivorus{
    public void grass(){
        System.out.println("Non vegeterian");
    }
    public void meat(){
        System.out.println("Vegetarian");
    }
}

   
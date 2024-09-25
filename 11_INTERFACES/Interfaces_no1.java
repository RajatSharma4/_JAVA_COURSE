interface Bicycle{
    int a = 45;
    void speedGear(int increement);
    void applyBrake(int decreement);
}

class Avon implements Bicycle{
    void blowHorn(){
        System.out.println(" pee peee");
    }
    public void speedGear(int increement){
        System.out.println("speed up");
    }
    public void applyBrake(int decreement ){
        System.out.println("stop bycycle");
    }
}
public class Interfaces_no1 {
    public static void main(String[] args) {
        Avon a = new Avon();
        a.blowHorn();
        a.applyBrake(23);
        a.speedGear(22);
        System.out.println(a.a);  // you can also print their properties-----/ 
        // but you can't modify your properties// becouse 
 //   your property is final// property
        
    }
}

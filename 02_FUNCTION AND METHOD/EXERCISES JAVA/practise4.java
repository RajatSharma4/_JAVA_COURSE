//problem 1 method 
class employee{
    int salary;
    String name;

    public int getsalary(){
        return salary;
    }
    public String getname(){
        return name;
    }
    public void setname(String n){
        name = n;
        
    }

   }

   //problem 2 method

   class cellphone{
    public void ring(){
        System.out.println("ringing...");
    }
    public void vibrate(){
        System.out.println("vibrating...");
    }
    public void callfriend(){
        System.out.println("calling rajat....");
    }
   }

   //problem 3 method

   class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
   }

   //problem 4 method

   class tommy{
    public void hit(){
        System.out.println("htiing the enemy");
    }
    public void fit(){
        System.out.println("fitting the enemy");
    }
    public void fire(){
        System.out.println("firing on the enemy");
    }
   }
 public class practise4 {
    public static void main(String[] args) {

       //problem 1

        // employee harry = new employee();
        // harry.setname("codewithrajat");
        // harry.salary = 333;

        // System.out.println(harry.getsalary());
        // System.out.println(harry.getname());

        //problem 2

        // cellphone asus = new cellphone();
        // asus.vibrate();
        // asus.ring();
        // asus.callfriend();

        //problem 3

        // square sq = new square();
        // sq.side = 3;
        // System.out.println(sq.area());
        // System.out.println(sq.perimeter());

        //problem 4

        tommy player = new tommy();
        player.fire();
        player.fit();
        player.hit();


    }
 
}
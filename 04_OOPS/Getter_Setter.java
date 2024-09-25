public class Getter_Setter {
    public static void main(String[] args) {
        pen obj = new pen(); // created a pen objectt
        obj.setColor("blue");
        System.out.println(obj.getColor());
        obj.setTip(5);
        

        obj.setColor("yellow");
        System.out.println(obj.getColor());

        newWork sc = new newWork();
        sc.username = "Rajat";
        System.out.println(sc.username);

       sc.setpassword = 122;
       System.out.println(sc.setpassword);

    }
}

class pen {
   private String color;
   private int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }

}
class newWork{
    String username;
    int setpassword;
}
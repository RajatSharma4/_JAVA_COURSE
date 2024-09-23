public class Method_overridding {
    public static void main(String[] args) {
        Deer a = new Deer();
        a.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("eat foods");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("eat grass");
    }
}
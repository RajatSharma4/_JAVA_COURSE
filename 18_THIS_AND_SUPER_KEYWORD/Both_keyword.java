class Ekclass{
    int a;
    public int getA(){
        return a;
    }
    Ekclass(int v){
        a = v;
    }
    public int returnone(){
        return 1;
    }
}
public class Both_keyword{
    public static void main(String[] args) {
        Ekclass e = new Ekclass(33);
        System.out.println(e.getA());
        
    }
}
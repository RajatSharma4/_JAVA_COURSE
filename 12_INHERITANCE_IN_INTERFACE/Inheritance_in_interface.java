interface smapleInterface {
    void meth1();

    void meth2();
}

interface childSampleInterface extends smapleInterface { // class does not extends interface..... in class u can use
                                                         // implewment word to add
     void meth3();
     void meth4();
}
class MySampleClass implements childSampleInterface{
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
}

public class Inheritance_in_interface {
    public static void main(String[] args) {
        MySampleClass m = new MySampleClass();
        m.meth1();
        m.meth2();
        m.meth3();
        m.meth4();

    }
}
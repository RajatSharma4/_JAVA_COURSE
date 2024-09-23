class C1{
      public int x = 5;
      protected int y = 45;
      int z = 6;
      private int a = 78;
      public void  meth_two(){
                 System.out.println(x);
                 System.out.println(y);
                 System.out.println(z);
                 System.out.println(a);
}
         
}
public class Advance_Access_Modifier {
    public static void main(String[] args) {
        C1 obj = new C1();
        obj.meth_two();
        System.out.println(obj.x);
        System.out.println(obj.y);
        System.out.println(obj.z);
        // System.out.println(obj.a);
    }
    
}

class Threaconstructor extends Thread{
    public Threaconstructor(String name){
        super(name);
    }
    public void run(){
        System.out.println("thank u");
    }
}
public class Thread_Constructor {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
         Threaconstructor  t1 = new Threaconstructor("Rajat");
         t1.start();
         System.out.println(" i am a thread of id is: " + t1.getId());
         System.out.println(" i am a thread of id is: " + t1.getName());
        
        
    }
    
}

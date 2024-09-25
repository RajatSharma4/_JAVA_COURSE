class Threadmethod1 extends Thread{
    public void run(){
        int i = 0;
        while(i<40){

            System.out.println("thank u");
            try{
                Thread.sleep(20);
            }
            catch(InterruptedException e){
              e.printStackTrace();
            }
            i++;
        }
    }
}
class Threadmethod2 extends Thread{
    public void run(){
        int i = 0;
        while(i<40){

            System.out.println("my thank u");
            i++;
        }
    }
}
public class Thread_Method {
    public static void main(String[] args) {
        Threadmethod1 t1 = new Threadmethod1();
        Threadmethod2 t2 = new Threadmethod2();
        t1.start();
        try{

            t1.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        t2.start();
        
    }
    
}

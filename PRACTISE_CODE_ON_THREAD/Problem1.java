class Printhread1 extends Thread{
    public void run(){
        int i= 0;
        while(i<50){

            System.out.println("Good morning");
            i++;

        }
    }

}
class Printhread2 extends Thread{
    public void run(){
        int i =0;
        while(i<50){

            System.out.println("Welcome");
            try{

            Thread.sleep(200);
        }catch (InterruptedException e) {
            System.out.println(e);
        }
            i++;
            
        }
    }
}
public class Problem1{
    public static void main(String[] args) {
        Printhread1 t1 = new Printhread1();
        Printhread2 t2 = new Printhread2();
        // t1.setPriority(6);
        // t2.setPriority(7);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t2.getState());
        // t1.start();
        // t2.start();
       
        
    }
}
class Threaconstructor extends Thread{
    public Threaconstructor(String name){
        super(name);
    }
    public void run(){
        int i = 0;
        while(i<40){

            System.out.println("thank u" + this.getName());
            i++;
        }
    }
}
public class Thread_priority {
    public static void main(String[] args) {
        Threaconstructor  t2 = new Threaconstructor("Rajat1");
        Threaconstructor  t3 = new Threaconstructor("Rajat2");
        Threaconstructor  t4 = new Threaconstructor("Rajat3");
        Threaconstructor  t5 = new Threaconstructor("Rajat4");
        Threaconstructor  t6= new Threaconstructor("Rajat5");
        Threaconstructor  t7 = new Threaconstructor("Rajat6");
        t6.setPriority(Thread.MAX_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t7.setPriority(Thread.MIN_PRIORITY);
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        
    }
    
}

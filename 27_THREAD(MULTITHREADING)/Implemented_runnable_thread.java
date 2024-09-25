class Runnablethread1 implements Runnable {
    public void run() {
        int i = 0;
        while(i<50){
        System.out.println("this is the thread 1 of runnable thread");
        i++;
        }
       
    }
}

class Runnablethread2 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while(i<50){
        System.out.println("this is the thread 2 of runnable thread");
        i++;
        }
       

    }
}

public class Implemented_runnable_thread {
    public static void main(String[] args) {

        Runnablethread1 bullet1 = new Runnablethread1();
        Thread Gun1 = new Thread(bullet1);  //for runnable thread it is importaNT TO KNOW 

        Runnablethread2 bullet2 = new Runnablethread2();
        Thread Gun2 = new Thread(bullet2);

         Gun1.start();
         Gun2.start();

    }

}

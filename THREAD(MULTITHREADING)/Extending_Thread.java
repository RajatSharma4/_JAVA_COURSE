class Mythread1 extends Thread{
    public void run(){
        int i = 0;
        while(i<50){

            System.out.println(" this thread 1 is coocking as well as running ");
            System.out.println("i am good");
            i++;
        }
    }
}
class Mythread2 extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<50){

            System.out.println("this thread 2 is eating  ");
            System.out.println("i am sad");
            i++;
        }
    }
}
class Extending_Thread{
    public static void main(String[] args) {
        Mythread1 t1 = new Mythread1();
        Mythread2 t2 = new Mythread2();
        t1.start();
        t2.start();

        
    }
}
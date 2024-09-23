public class BrandCo {
    public static void main(String[] args) {
        // break and continue using loops:
        //for (int i = 0; i < 5; i++) {
           // System.out.println(i);
           // System.out.println("java is great");
           // if (i == 2) {
               // System.out.println("ending the loop");
               // break;
           // }
       // }
       //continue
       //for(int i =0; i<50; i++){
        //if(i==2){
            //System.out.println("ending the loop");
            //continue;
       // }
        //System.out.println(i);
       // System.out.println("java is great");
      // }
      int i =0;
      do{
        i++;
        if(i==2){
            System.out.println("ending the loop");
            continue;
        }
        System.out.println(i);
        System.out.println("loop is great");
      }while(i<5);
      System.out.println("loop end here");


    }

}

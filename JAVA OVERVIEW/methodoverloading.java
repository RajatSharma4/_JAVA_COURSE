public class methodoverloading {
    static void foo(){
        System.out.println("goo morning broo!");
    }
    static void foo(int a){
        System.out.println("good morning " + a +  " bro! ");
    }
    static void foo(int a, int b){
        System.out.println("good morning " + a +  " bro! ");
        System.out.println("good morning " + b +  " bro! ");
    }
    static void change(int a){
        a=90;
    }
    static void change1(int [] arr){
        arr[0]=56;
    }
    static void telljoke(){
        System.out.println("i invented a new word!\n" + "plagiarism");
    }
    public static void main(String[] args) {
      //  telljoke();
     // int [] marks = {22,45,34,76,56,87};

      //case 1: changing the integer

      //int x =45;
      //change(x);
      //System.out.println("the value of x afterf running change is: " + x);

      //case 2: changing the array

     // int [] marks = {22,45,34,76,56,87};
      //change1(marks);
    // System.out.println("the value of x after running change is: " + marks[0]);
         foo();
         foo(8000);
         foo(1000, 40000);
    //arguement are actual


    }
    
}

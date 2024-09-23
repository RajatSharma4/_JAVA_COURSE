class TestData{
    int data_a;
    public int data_b; //public class
    private int data_c; //private class
    //as the private data cannot be accesed directly this method return the value of data_c

    void setc(int value){
     // set the value of data_c
     data_c = value;
    }
    int getc(){
        // get the value of data_c
        return data_c;
    }
}
public class Acces_modifier {
    public static void main(String[] args) {
        TestData ob = new TestData();

        //this is ok data_a and data_b may be accesed directly

        ob.data_a = 10;
        ob.data_b = 20;

        //this is not okk annd will couse an error as the data_c is private and can be accessed only within the class 
        // ob.data_c = 100;---- error....

        // we must access data_c throught its method
        ob.setc(100);
        System.out.println("data_a, data_b and data_c: " + ob.data_a + "" + ob.data_b + "" + ob.getc());
        
    }
}

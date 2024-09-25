public class ARRAY {
    public static void main(String[] args) {
        //classrom of 500 students - you have to store marks of these 500 students
       //// int[] marks = new int[5];
       //// marks[0] = 30;
       //// marks[1] = 56;
       //// marks[2] = 45;
       //// marks[3] = 66;
       //// marks[4] = 99;
  
       /*  String [] students = {"haary", "rajat", "vaibhav", "ayush"};
        System.out.println(marks[4]);
        System.out.println(marks.length);
        System.out.println(students[3]);

        //displaying an array(naive way)
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        */

        //displaying an array using for loop in (reverse order)
        //for(int i=marks.length-1; i>=0; i--){
          //  System.out.println(marks[i]);
            
     //   }
        //displaying an array using for loop 

        //for(int i=0; i<marks.length; i++){
         //   System.out.println(marks[i]);
            
     //   }

        //displaying the array using (for each loop)

       // for(int element: marks){
          //  System.out.println(element);
     //   }

        //MULTIDIMENTIONAL ARRAY
        //2D ARRAY

        int [][] flats;
        flats = new int [2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        System.out.println("printing a 2-D array using for loop");
        for(int i=0; i<flats.length; i++){
            for(int j=0; j<flats[i].length; j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
    
}

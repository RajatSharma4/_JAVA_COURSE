
public class practise2 {
    public static void main(String[] args) {

        //Problem no 1

        //float arr [] = {20.0f,40.0f,50.0f,10.0f,30.0f};
       // float sum = arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
        //System.out.println(sum);

        //problem no 2
         
      /*  int[] marks = {22,23,54,56,67,76};
        int sum = 23;
        boolean isinArray =false;
        for(int element:marks){
            if(sum==element){
                isinArray=true;
                break;
            }
        }
        if(isinArray){
            System.out.println("the value is present in the array: ");
        }
        else{
            System.out.println("the value is not present in the array: ");
        }*/

        //problem no3

      /*   int [][] mat1 = {{1,2,3},{4,5,6}};
        int [][] mat2 = {{7,8,9},{6,4,5}};
        int [][] result = {{0,0,0},{0,0,0}};

        for(int i=0; i<mat1.length; i++){
            for(int j=0; j<mat1[i].length; j++){
                result[i][j] = mat1[i][j]+mat2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println("");
        } */
           
        //problem no4

        int [] arr = {1,2,3,4,6,7};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;

        for(int i=0; i<n; i++){
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        for(int element: arr){
            System.out.println(element + "");
        }
    }


    }
    


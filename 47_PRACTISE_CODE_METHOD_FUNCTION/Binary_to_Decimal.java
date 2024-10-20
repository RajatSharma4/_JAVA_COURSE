public class Binary_to_Decimal {
    public static void BinToDec(int binNum){
        int Mynum = binNum;
        int pow = 0;
        int decNum = 0;
        while(binNum>0){
            int lastDigit = binNum%10;
         decNum = decNum+(lastDigit*(int)Math.pow(2, pow));
         pow++;
         binNum = binNum/10;

         
        }
        System.out.println("decimal of " + Mynum + "=" + decNum);
    }
    public static void main(String[] args) {
        BinToDec(101);


        
    }
    
}

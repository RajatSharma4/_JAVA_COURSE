public class Decimal_To_Binary {
    public static void DecToBin(int n){
        int Mynum = n;
        int pow = 0;
        int BinNum = 0;
        while(n>0){
            int rem = n%2;
            BinNum = BinNum + (rem * (int)Math.pow(10, pow));
            pow++;
            n = n/2;

            
        }
        System.out.print("Binary form of " + Mynum + " = "+ BinNum);
    }
    public static void main(String[] args) {
        DecToBin(7);
    }
    
}

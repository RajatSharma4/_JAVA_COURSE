public class Strmethod {
    public static void main(String[] args) {
        String name = "Rajat";
       // System.out.println(name);

      // int Value = name.length();
      // String Value = name.toLowerCase();

      // String Value = name.toUpperCase();
      // System.out.println(Value);

      // String nonTrimmedString = "        Rajat      ";
      // System.out.println(nonTrimmedString.trim());
      System.out.println(name.substring(0));
      System.out.println(name.substring(1, 4));
      System.out.println(name.replace('a', 'r'));
      System.out.println(name.replaceAll("t", "aj"));
    }
    
}

public class DoubleUp {
   /**
     * Returns a new string where each character of the given string is repeated twice.
     * Example: doubleUp("hello") -> "hheelllloo"
     */

   public static String doubleUp(String s) {
	   if(s == null)
		   return null;
	   String res = "";
	   //StringBuilder res = new StringBuilder();
	   for(char c: s.toCharArray()){
		   res = res + c + c;
		   //res.append(c + c);
	   }
	   //return res.toString();
	   return res;
   }
   
   public static void main(String[] args) {
      String s = doubleUp("hello");
      System.out.println(s);
      
      System.out.println(doubleUp("cat"));
   }
}

public class PrintIndexed {
   /**
     * Prints each character of a given string followed by the reverse of its index.
     * Example: printIndexed("hello") -> h4e3l2l1o0
     */
   public static void printIndexed(String s) {
      // TODO: Fill in this function
      int l = s.length();
      int i = 1;
      String res = "";

      for(char c:s.toCharArray()){
      	res = res + c + (l - i);
	i++;
      }
      IO.println("The string with reversed index is : " + res);
   }

   public static void main(String[] args) {
      printIndexed("hello");
      printIndexed("cat"); // should print c2a1t0
   }
}

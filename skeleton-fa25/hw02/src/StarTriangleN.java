public class StarTriangleN {
   /**
     * Prints a right-aligned triangle of stars ('*') with N lines.
     * The first row contains 1 star, the second 2 stars, and so on. 
     */
   private static String getNStr(String c, int i){
	   String s = new String(c); 
	   if(i == 0)
		   return "";
	   if(i == 1)
		   return s;
	   for(int j = 2 ; j <= i; j++)
		   s = s + c;
	   return s;

   }
   public static void starTriangle(int N) {
      // TODO: Fill in this function
      for(var i = 1; i <= N; i++){
	      System.out.format("%s%s\n"
			      ,StarTriangleN.getNStr(" ",N - i)
			      ,StarTriangleN.getNStr("*", i));

      }
   }
   
   public static void main(String[] args) {
      starTriangle(9);
   }

}

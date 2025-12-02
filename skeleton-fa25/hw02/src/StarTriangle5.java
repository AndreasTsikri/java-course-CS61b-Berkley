public class StarTriangle5 {
   /**
     * Prints a right-aligned triangle of stars ('*') with 5 lines.
     * The first row contains 1 star, the second 2 stars, and so on. 
     */
   static final String sstar= "*****";
   static final String ssp= "     ";

   public static String getFromStr(String str, int i){
   
	   if(i < 0 || i > 5)
		   return null;

	   switch(i){
		   case(0):return "";
		   case(5):return str;
		   default : return str.substring(5 - i); 
	   }

   }
   public static String getStars(int i){
 	return StarTriangle5.getFromStr(StarTriangle5.sstar,i);	   
   }
   public static String getSpaces(int i){
 	return StarTriangle5.getFromStr(StarTriangle5.ssp,i);	   
   }
   public static void starTriangle5() {

	int[] a = {1,2,3,4,5};
	for(var i : a){
	   String ss = StarTriangle5.getStars(i);
	   String sp = StarTriangle5.getSpaces(5 - i);
	   System.out.format("%s%s \n",sp,ss);
	}
   }
   
   public static void main(String[] args) {
      IO.println("Printing 5 stars : ");
      starTriangle5();
   }
}

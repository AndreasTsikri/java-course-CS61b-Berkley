package implementations;

import java.util.Arrays;
import java.util.Collections;

public class ArrayExercises {
    /** Returns the second to last item in the given array.
     
     *  Assumes the array has at least 2 elements. 
     **/
	private static int[] t = {1,2,101,201};
	public static void main(){minMaxDifference(t);}
    public static String secondToLastItem(String[] items) {
        if(items == null)
		return null;
	String s = "";

	for(var i = 1 ; i < items.length;i++)
		s+=items[i];
	return s;
    }    

    /** Returns the difference between the minimum and maximum item in the given array */
    public static int minMaxDifference(int[] items) {
        int min = Arrays.stream(items).min().getAsInt();	
        int max = Arrays.stream(items).max().getAsInt();
	IO.println("min : " + min);	
	IO.println("min : " + max);	
	return max - min;
    }
}

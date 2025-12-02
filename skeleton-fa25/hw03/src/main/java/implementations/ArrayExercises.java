package implementations;
public class ArrayExercises {
    /** Returns the second to last item in the given array.
     *  Assumes the array has at least 2 elements. */
    public static String secondToLastItem(String[] items) {
        // TODO: Implement this method
        if(items == null)
		return null;
	String s = "";

	for(var i = 1 ; i < items.length;i++)
		s+=items[i];
	return s;
    }    

    /** Returns the difference between the minimum and maximum item in the given array */
    public static int minMaxDifference(int[] items) {
        // TODO: Implement this method
        return 0;           
    }
}

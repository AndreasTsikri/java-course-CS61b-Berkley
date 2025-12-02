import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class ListExercises {
    /** Returns the total sum in a list of integers */
    public static void main()
    {
	    int[] a1 = {1,2,3,4,5};
	    int[] a2 = {2,4,5,65,43};
    	    
	    List<Integer> l1 = List.of(1,2,3,4,5);
    	    List<Integer> l2 = List.of(2,4,5,65,43);

	    List<String> lstr = Arrays.asList("hhh", "holly", "hello", "hello","shit","hi");

	    String w = "hello";
	    char c = 'h';

	    IO.println("-----------------------");
	    IO.println("sum : " + sum(l1));
	    IO.println("-----------------------");
	    IO.println("even list : " + evens(l1));
	    IO.println("-----------------------");
	    var al1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
	    IO.println("common items of l1, l2 : " + common(al1,l2));
	    IO.println("-----------------------");
	    IO.println("occurances of WORD : " + w + " is " + countOccurrencesOfWord(lstr, w));
	    IO.println("-----------------------");
	    IO.println("occurances of CHAR : " + c + " in all is " + countOccurrencesOfC(lstr, c));
    }
    public static int sum(List<Integer> l) {
        if(l == null)
		return 0;

	int s = 0;
	for(var il : l)
		s = s +il;
	return s;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        if(L == null) return null;
	return L.stream().filter( e -> e % 2 == 0).collect(Collectors.toList());
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        if (L1 == null || L2 == null) return null;
	//return L1.retainAll(L2);
	L1.retainAll(L2);
	return L1;
    }

    public static int countOccurrencesOfWord(List<String> words, String w) {
        if (words == null) return 0;
	int cnt = 0;
	for(var str: words)
		if(w.equals(str))
			cnt++;
	return cnt;
    }

    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        int cnt = 0;
	    for(var w:words){
		    for(int i =0; i < w.length();i++){
			    if(w.charAt(i) == c)
				    cnt++;		    
		    }
	    }
	return cnt;
    }
}

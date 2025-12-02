import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapExercises {
    /** Returns a map from every lower case letter to the number corresponding to that letter, where 'a' is
     * 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.
     */
	public static void main(){
	
		IO.println("map is : " +  letterToNum());

		IO.println("count words : " + countWords(List.of("hello","hallo","hello","tinapw")));
	}
    public static Map<Character, Integer> letterToNum() {
        
	char[] d = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

	var m = new TreeMap<Character,Integer>();
	for(var c :d)
		m.put(Character.valueOf(c), Character.getNumericValue(c) - 9);
	return m;

    }

    /** Returns a map from the integers in the list to their squares. For example, if the input list
     *  is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to 49.
     */
    public static Map<Integer, Integer> squares(List<Integer> nums) {
	if(nums == null) return null;
	var m = new TreeMap<Integer,Integer>();
	for(var i : nums)
		m.put(i , i*i);
	return m;
    }

    /** Returns a map of the counts of all words that appear in a list of words. */
    public static Map<String, Integer> countWords(List<String> words) {
        if(words == null ) return null;
	var m = new TreeMap<String, Integer>();
        int i = 1;
	for(var w: words){
		int cnt = 0;
		for(var w2 : words.subList(i,words.size())){
			if(w.equals(w2))
				cnt++;
		}
		m.put(w,cnt);

	}
        return m;
    }
}

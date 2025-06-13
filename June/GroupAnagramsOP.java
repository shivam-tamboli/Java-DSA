import java.util.*;

public class GroupAnagramsOP{

public static List<List<String>> isGroupAnagrams(String[] strs){

HashMap<String, List<String>> map = new HashMap<>();

for(String s : strs){//word to word ex - "cat"

char[] chars = s.toCharArray();//words become ex- ["c","a","t"] in sort alphabatecally.

Arrays.sort(chars);//in sort order ex - ["a","c","t"] of a word.

String key = new String(chars);//convert to String ex - "act"

if(!map.containsKey(key)){//if key not exist then, add it to the map and create a new empty list.
	map.put(key, new ArrayList<>());
}

map.get(key).add(s);//if exists get the key and add the s(word).
	}

return new ArrayList<>(map.values());//in return create a new list and print values of map.

}

public static void main(String[] args){

String[] strs = {"act", "pots", "tops", "cat", "stop", "hat"};

List<List<String>> result = isGroupAnagrams(strs);

System.out.println(result);
	}
} 
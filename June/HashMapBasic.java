import java.util.*;

public class HashMapBasic{

	public static void main(String[] args){

	HashMap<String , Integer> map = new HashMap<>();

	map.put("Apple",7);
	map.put("Banana",1);
	
	for(String maps : map.keySet()){
		System.out.println(maps + ":" + map.get(maps));
		}
	}
}

	
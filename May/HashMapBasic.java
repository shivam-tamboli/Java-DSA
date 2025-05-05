import java.util.*;

public class HashMapBasic{

	public static void main(String[] args){
	
	HashMap<Integer, Integer> map = new HashMap<>();


	map.put(2, 1);
	map.put(3, 1);
	map.put(4, 2);
	map.put(5, 3);

	map.get(4);

	map.containsKey(2);  

	/*if(map.containskey(num)){
	map.put(num, map.get(num) + 1);
	}else{
	map.put(num , 1);
	}*/

	System.out.println(map);

	


	

	
	}
}
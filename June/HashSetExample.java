import java.util.*;

public class HashSetExample{

	public static void main(String[] args){
	
	HashSet<Integer> map = new HashSet<>();

	map.add(10);
	map.add(20);
	map.add(10);

	map.contains(10);
	map.remove(10);

	System.out.println(map.size());

	for(int num : map){
		System.out.println(num);	
		}
	}
}
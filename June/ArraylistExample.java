import java.util.*;

public class ArraylistExample{
	
	public static void main(String[] args){

	ArrayList<Integer> list = new ArrayList<>();

	list.add(10);
	list.add(20);
	list.get(0);
	list.set(1, 56);
	list.remove(0);
	list.size();

	for(int lists : list){
		System.out.println(lists);
		}
	}

}
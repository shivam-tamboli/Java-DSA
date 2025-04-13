import java.util.*;

public class ArrayListBasic{
	
	public static void main(String[] args){

	ArrayList<Integer> list = new ArrayList<>();


	//adding elements in list.
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	System.out.println(list);


	//removing by index.
	list.remove(1);
	System.out.println("after removing the element by index" + list);


	//removing by number.
	list.remove(Integer.valueOf(40));
	System.out.println("after removing the element by the value" + list);
	
	
	//fetch the index value.
	int value = list.get(1);
	System.out.println(" fetch the value by index" + value);

	int size = list.size();
	System.out.println("Size of the list" + size);

	for(int num : list){
		System.out.println("traversal in arraylist" + num);
		}
	}
}
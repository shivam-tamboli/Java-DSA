import java.util.*;

public class DynamicArraysExample{

	public static void main(String[] args){


	ArrayList<Integer> list = new ArrayList<>();

	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	list.add(50);
	list.add(60);

	System.out.println("List after adding elements:" + list);

	System.out.println("We will get the index value of 2 : " + list.get(2));
	
	list.set(3, 35);

	list.remove(0);

	for(int val : list){
		System.out.println(val + " ");
		}
	}
}
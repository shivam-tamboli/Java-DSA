import java.util.*;

public class StackExample{

	public static void main(String[] args){
	
		//create a stack.
		Stack<Integer> stack = new Stack<>();


		//push elements.
		stack.push(10);
		stack.push(20);

		//print stack.
		System.out.println(stack);		//Expected Output : [10, 20]
		
		//pop, recently saved element will be removed.
		stack.pop();		

		//print stack.
		System.out.println(stack);     //Expected Output : [10]

		//look at the top of the stack, without removing the element.
		System.out.println(stack.peek());		//Expected Output : 10

		//check is stack empty or not.
		System.out.println(stack.isEmpty());   // false
	}
}


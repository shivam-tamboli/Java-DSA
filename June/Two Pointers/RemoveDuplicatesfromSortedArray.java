import java.util.*;

public class RemoveDuplicatesfromSortedArray{

	public static int RemoveDuplicates(int[] nums){

	/*
	*Time Complexity : O(n)
	*Space Complexity : O(1)
	*/

	//start from [1] index because, [0] element always unique.
	
	//initial pointer.
	int slow = 1;

	//initial pointer.
	for(int fast = 1; fast < nums.length; fast++){

		//compare with prev element, if not equal.
		if(nums[fast] != nums[fast - 1]){

			//it means unique val.
			//copy element in slow pointer.
			nums[slow] = nums[fast];

			//store unique elements.
			slow++;
			}
		}	
		//contains length, unique elements.
		return slow;
	}


	public static void main(String[] args){
	
	int[] nums = {1,1,2};
	
	int result = RemoveDuplicates(nums);

	System.out.println("Length of unique elements : " + result);	

	System.out.print(" nums { ");
	for(int i = 0; i < nums.length; i++){
		if(i < result){
			System.out.print(nums[i]);
			}
			else{	
				System.out.print("_");
				}

		if(i != nums.length - 1){
			System.out.print(", ");
			}
		}
	System.out.print(" } ");
	} 
}
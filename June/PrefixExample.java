import java.util.*;

public class PrefixExample{

public static void main(String[] args){


int[] num = {2,4,6,8,10};

int[] prefix = new int[num.length + 1];

for(int i  = 0; i < num.length; i++){
prefix[i + 1] = prefix[i] + num[i];
}

int i = 1; int j = 3;
int sum = prefix[j + 1] - prefix[i];
System.out.println("Sum for " + i + "to" + j + "is" + sum); 

	}
}



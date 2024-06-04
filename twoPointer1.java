import java.util.*;

public class twoPointer1{
	public static void main(String[] args) {
		int[] array = {1, 4 , 6 , 8, 9, 11};
		int length = array.length-1;
		int k = 9;
		int i = 0;
		int j = length;

		while(i<j){
			if (i!=j && array[i]+array[j] == k){
				System.out.println(i+" "+j);
				return;
			}else if (array[i]+array[j] > k){
				j--;
			}else{
				i++;
			}
		}

		System.out.println("Not found");
	}
}
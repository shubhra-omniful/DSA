import java.util.*;

public class slidingWindow1{
	public static void main(String[] args) {
		int[] array = {1, 2, 5, 6, 7, 9 , 11, 28};
		int length = array.length;
		int k = 22;
		int size = 3;

		int sum = 0;

		for(int i=0;i<size-1;i++){
			sum += array[i];
		}

		if ( sum == k){
			System.out.println("Found");
			return;
		}

		for (int i=size;i<length;i++){
			sum = (sum -(array[i-size]))+array[i];
			if ( sum == k){
				System.out.println("Found");
				return;
			}

		}

		System.out.println("Not found");
	}
}
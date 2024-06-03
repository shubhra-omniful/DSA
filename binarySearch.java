import java.util.*;

public class binarySearch{
	public static void main(String[] args) {
		int[] array = {4,8, 9, 11, 13, 17, 21};
		int targetValue = 17;

		int left = 0;
		int right = array.length-1;
		int mid = 0;

		while( left<= right ){
			mid = Math.abs((left+right)/2);

			if ( array[mid] == targetValue){
				System.out.println(mid);
				return;
			}else if (array[ mid ] < targetValue ) {
				left = Math.abs((mid+right)/2);
			}else{
				right = Math.abs((mid+right)/2);
			}		
		}

		System.out.println("Not found");
	}
}
import java.lang.*;
import java.util.*;

class sorter_class{

	public void sort(int[] arr){
		Arrays.sort(arr);
	}

	public void sort(String[] arr){
		Arrays.sort(arr);
	}

	public void sort(char[] arr){
		Arrays.sort(arr);
	}

	public void sort(boolean[] arr){
		for ( int i = 0; i < arr.length; i++ ){
			for ( int j = 0; j < arr.length - 1 - i; j++ ){
				if ( !arr[j] && arr[j+1] ){
					arr[j] = true;
					arr[j+1] = false;
				}
			}
		}
	}
}
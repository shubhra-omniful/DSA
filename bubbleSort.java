import java.util.*;

public class bubbleSort{
	public static void main(String[] args){
		int[] array = {2, 11,0,5, 1};
		int length = array.length;
		int temp = 0;

		for (int i =0 ;i < length; i ++){
			for (int j = 0;j<length-1-i;j++){
				if ( array[j]>array[j+1]){
					temp = array[j];
					array[j] = array[j+1];
					array[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}
}
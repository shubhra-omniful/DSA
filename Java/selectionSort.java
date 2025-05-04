import java.util.*;

public class selectionSort{
	public static void main(String[] args) {
		int[] array = {2, 11,0,5, 1};
		int length = array.length;
		int temp = 0;
		int index = -1;

		for (int i=0;i<length-1;i++){
			index = i;
			for(int j =i+1;j<length;j++){
				if (array[index] > array[j]){
					index = j;
				}
			}

			temp = array[index];
			array[index] = array[i];
			array[i] = temp;
		}

		System.out.println(Arrays.toString(array));
	}
}
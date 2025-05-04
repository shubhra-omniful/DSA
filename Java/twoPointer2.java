import java.util.*;

public class twoPointer2{
	public static void main(String[] args) {
		int[] array = {1, 4 , 6 , 8, 9, 11};
		int length = array.length-1;
		int k = 20;
		int i = 0;
		int j = 1;

		while(j<length ){
			if (i!=j && array[i]+array[j] == k){
				System.out.println(i+" "+j);
				return;
			}else if ( k > (array[i]+array[j]) ){
				j++;
			}else{
				i++;
			}
		}

		System.out.println("Not found");
	}
}
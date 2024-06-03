import java.util.*;

public class linearSearch{
	public static void main(String[] args) {
		int[] array = {4,8, 9, 11, 13, 17, 21};
		int targetValue = 17;

		for (int i=0;i<array.length;i++){
			if ( targetValue == array[i] ){
				System.out.println(i);
				return;
			}
		}

		System.out.println("Not found");
	}
}
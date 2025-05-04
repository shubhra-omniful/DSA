import java.util.*;


public class fibonacci1{
	public static void main(String[] args) {
		Scanner sanner = new Scanner(System.in);
		System.out.println("Please enter the value");
		int length = sanner.nextInt();

		if ( length == 0 || length == 1){
			System.out.println(length);
			return ;
		}

		int first = 1;
		int pre = 0;
		int next =0 ;

		for (int i=0;i<length;i++){

			System.out.print(first+", ");
			next = first;
			first = first + pre;
			pre = next;
		}
	}
}
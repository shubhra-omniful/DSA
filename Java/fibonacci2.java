import java.lang.*;
import java.util.*;

public class fibonacci2{

	public static int fibonacci(int n){
		// f(n)= f(n-1)+f(n-2);

		if ( n==0 || n== 1){
			return n;
		}

		return fibonacci(n-1)+fibonacci(n-2);
	}


	public static void main(String[] args) {
		System.out.println(fibonacci(10));
	}
}
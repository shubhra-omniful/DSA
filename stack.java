import java.util.*;

public class stack{
	public static void main(String[] args) {
		Stack<Integer>stack=new Stack<>();

		stack.add(1);
		stack.add(2);
		stack.add(3);
		stack.add(4);
		stack.add(5);

		System.out.println(stack);

		stack.pop();

		System.out.println(stack);

		stack.push(6);

		System.out.println(stack);

		System.out.println(stack.peek());

		stack.addFirst(7);

		System.out.println(stack);

		stack.addLast(8);

		System.out.println(stack);
	}
}
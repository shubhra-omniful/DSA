import java.util.*;

public class queue{
	public static void main(String[] args) {
		Queue<Integer>queue=new LinkedList<>();

		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		queue.add(6);

		System.out.println(queue);

		queue.poll();

		System.out.println(queue.peek());

		queue.remove();
		
		System.out.println(queue);
	}
}
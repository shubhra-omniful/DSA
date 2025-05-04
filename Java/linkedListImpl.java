import java.util.*;


class Node{

	int data;
	Node next;

	public Node(int data){
		this.data = data;
		this.next = null;
	}

	public void printNode(){
		System.out.println(this.data+" -> "+this.next);
		return;
	}
}

class LinkedList{
	Node head;

	public LinkedList(){
		this.head = null;
	}

	public void addLast(int data){
		if (this.head == null){
			this.head =new Node(data);
		}

		Node current = this.head;

		while(current.next != null){
			current = current.next;
		}

		current.next = new Node(data);
		return;
	}

	public void addFirst(int data){
		if (this.head==null){
			this.head = new Node(data);
			return;
		}

		Node node = new Node(data);
		node.next = this.head;
		this.head = node;
		return;
	}

	public void removeNode(int data){
		if (this.head == null){
			System.out.println("Empty");
			return;
		}

		Node current = this.head;
		Node pre = null;

		while(current.next != null ){
			if ( current.data == data ){

				if ( pre == null ){
					this.head = current.next;
					return ;
				}

				pre.next = current.next;
				return;
			}

			pre = current;
			current = current.next;
		}

		System.out.println("Not Found");
	}

	public void addIn(int data, int index){
		if ( this.head == null ){
			System.out.println("Empty");
			return ;
		}

		Node current = this.head;
		Node pre = null;
		int count = 0;

		while( current.next != null ){
			if (count == index){

				Node node = new Node(data);

				if ( pre == null ){
					node.next = current;
					this.head = node;
					return ;
				}

				pre.next = node;
				node.next = current;
				return ;
			}

			pre = current;
			current = current.next;
			count++;
		}

		System.out.println("Please provide less index");
	}

	public void printLinkedList(){
		if (this.head == null ){
			System.out.println("Empty");
			return;
		}

		Node current = this.head;
		while(current.next != null){
			System.out.print(current.data+" ");
			current = current.next;
		}
	}

}

public class linkedListImpl{


	public static void main(String[] args) {
		Node node = new Node(1);
		node.printNode();

		LinkedList linkedList = new LinkedList();

		for (int i=1;i<=10;i++){
			linkedList.addLast(i);
		}

		linkedList.printLinkedList();
		System.out.println();

		for (int i=11;i<=15;i++){
			linkedList.addFirst(i);
		}

		linkedList.printLinkedList();
		System.out.println();

		linkedList.removeNode(15);

		linkedList.printLinkedList();

		System.out.println();

		linkedList.addIn(78,0);

		linkedList.printLinkedList();
	}

}
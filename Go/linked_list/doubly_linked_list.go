package main

import "fmt"

type Node struct{
	next *Node
	val int
	prev *Node
}

func LinkedList(val int) *Node{
	return &Node{val : val}
}

func (head *Node) InsertAtEnd(val int) *Node{
	if head == nil {
		return &Node{val : val}
	}

	curr := head
	for curr.next != nil{
		curr = curr.next
	}

	curr.next = &Node{val : val, prev : curr}
	return head
}

func (head *Node) InsertAtFirst(val int) *Node{
	if head == nil {
		return &Node{val : val}
	}

	node := &Node{val : val}
	node.next = head
	head.prev = node
	return node
}

func (head *Node) Print() *Node{
	for curr := head; curr != nil; curr = curr.next{
		fmt.Println(curr.val)
	}

	fmt.Println("\n")

	return head
}

func (head *Node) PrintReverse() *Node{
	curr := head;
	for curr.next != nil{
		curr = curr.next
	}

	for curr.prev != nil {
		fmt.Println(curr.val)
		curr = curr.prev
	}

	fmt.Println("\n")

	return head
}

func main(){
	LinkedList(1).InsertAtEnd(2).
	InsertAtEnd(3).Print().
	InsertAtFirst(4).PrintReverse().Print()
}


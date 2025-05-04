package main

import "fmt"

type Node struct {
	val  int
	next *Node
}

func LinkedList(val int) *Node {
	return &Node{val: val}
}

func (head *Node) InsertAtEnd(val int) *Node {
	if head == nil {
		return &Node{val: val}
	}

	curr := head
	for curr.next != nil {
		curr = curr.next
	}

	curr.next = &Node{val: val}
	return head
}

func (head *Node) InsertAtFirst(val int) *Node {
	if head == nil {
		return &Node{val: val}
	}

	node := &Node{val: val}
	node.next = head
	return node
}

func (head *Node) Print() *Node {
	for curr := head; curr != nil; curr = curr.next {
		fmt.Println(curr.val)
	}

	fmt.Println("\n")

	return head
}

func (head *Node) Reverse() *Node {
	if head == nil {
		return head
	}

	curr := head
	var prev *Node = nil

	for curr != nil {
		next := curr.next
		curr.next = prev
		prev = curr
		curr = next
	}

	return prev
}

func main() {
	LinkedList(1).InsertAtEnd(2).
		InsertAtFirst(3).InsertAtEnd(9).
		InsertAtFirst(0).Reverse().Print().Reverse().Print()
}

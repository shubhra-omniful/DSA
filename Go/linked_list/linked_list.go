package main

type LinkedList interface {
	LinkedList(val int) *Node
	InsertAtEnd(val int) *Node
	InsertAtFirst(val int) *Node
	Reverse() *Node
	Print() *Node
	PrintReverse() *Node
}

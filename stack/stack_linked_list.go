package main

import "fmt"

type Node[T any] struct {
	val  T
	next *Node[T]
}

type Stack[T any] struct {
	head *Node[T]
}

func NewStack[T any]() *Stack[T]{
	stack := new(Stack[T])
	return stack
}

func (stack *Stack[T]) IsEmpty() bool {
	return stack.head == nil
}

func (stack *Stack[T]) Push(val T) {
	newNode := &Node[T]{val: val}
	newNode.next = stack.head
	stack.head = newNode
	return
}

func (stack *Stack[T]) Pop() {
	if stack.IsEmpty() {
		panic("stack is empty")
	}

	stack.head = stack.head.next
	return
}

func (stack *Stack[T]) Top() T {
	if stack.IsEmpty() {
		panic("stack underflow")
	}

	return stack.head.val
}

func main() {
	numbers := []int{1,2,3,4,5,6,7,8,9,10,11,12,13}
	stack := NewStack[int]()

	for _, number := range numbers {
		fmt.Println("Push ",number)
		stack.Push(number)
	}

	for !stack.IsEmpty() {
		fmt.Println("Top ",stack.Top())
		stack.Pop()
	}
}

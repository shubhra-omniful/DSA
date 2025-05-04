package main

import "fmt"

type Node[T any] struct {
	val  T
	next *Node[T]
}

type Queue[T any] struct {
	front *Node[T]
	rear  *Node[T]
}

func NewQueue[T any]() *Queue[T] {
	queue := new(Queue[T])
	return queue
}

func (queue *Queue[T]) IsEmpty() bool {
	return queue.front == nil && queue.rear == nil
}

func (queue *Queue[T]) Enqueue(val T) {
	node := new(Node[T])
	node.val = val

	if queue.IsEmpty() {
		queue.front = node
		queue.rear = node
		return
	}

	queue.rear.next = node
	queue.rear = queue.rear.next
	return
}

func (queue *Queue[T]) Dequeue() T {
	prev := queue.front
	if queue.IsEmpty() {
		panic("queue is empty")
	} else if queue.front == queue.rear {
		queue.front = nil
		queue.rear = nil
	} else {
		queue.front = queue.front.next
	}

	return prev.val
}

func (queue *Queue[T]) Front() T {
	if queue.IsEmpty() {
		panic("queue is empty")
	}

	return queue.front.val
}

func (queue *Queue[T]) Print() {
	head := queue.front
	for head != nil {
		fmt.Println(head.val)
		head = head.next
	}
}

func main() {
	//numbers := []int{1,2,4,5,6,7,8,9,10}
	queue := NewQueue[int]()
	queue.Enqueue(1)
	queue.Enqueue(2)
	queue.Enqueue(3)
	queue.Enqueue(4)
	queue.Enqueue(5)
	queue.Dequeue()
	queue.Dequeue()
	queue.Dequeue()
	queue.Dequeue()
	queue.Dequeue()

	queue.Dequeue()
	//queue.Enqueue(6)
	// queue.Enqueue(7)
	// queue.Enqueue(8)
	//queue.Enqueue(9)

	if queue.front != nil {
		fmt.Println("front ", queue.front.val)
	}else{
		fmt.Println("front is nil")
	}

	if queue.rear != nil {
		fmt.Println("rear ", queue.rear.val)
	}else{
		fmt.Println("rear is nil")
	}
}

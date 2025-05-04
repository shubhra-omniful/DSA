package main

import "fmt"

type Queue[T any] struct{
	data []T
	front int
	rear int
	size int
}

func NewQueue[T any]() *Queue[T]{
	queue := new(Queue[T])
	queue.front = -1
	queue.rear = -1
	queue.size = 5
	queue.data = make([]T,queue.size)

	return queue
}


func (queue *Queue[T]) IsEmpty() bool {
	return queue.front == -1 && queue.rear == -1
}

func (queue *Queue[T]) IsFull () bool {
	return queue.front == ( queue.rear + 1 ) % queue.size
}

func (queue *Queue[T]) Enqueue(val T) {
	if queue.IsEmpty(){
		queue.front = 0
		queue.rear = 0
	}else if queue.IsFull() {
		panic("queue is full")
	}else{
		queue.rear = ( queue.rear + 1 ) % queue.size
	}

	queue.data[queue.rear] = val
	return
}

func (queue *Queue[T]) Dequeue() T {
	front := queue.front
	if queue.IsEmpty(){
		panic("queue underflow") 
	}else if queue.rear == queue.front {
		queue.rear = -1
		queue.front = -1
	}else{
		queue.front = ( queue.front + 1 ) % queue.size
	}

	result := queue.data[front]
	var t T
	queue.data[front] = t
	return result
}

func (queue *Queue[T]) Front() T {
	if queue.IsEmpty(){
		panic("queue is empty") 
	}

	return queue.data[queue.front]
}


func main(){
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

	queue.Enqueue(6)
	// queue.Enqueue(7)
	// queue.Enqueue(8)
	//queue.Enqueue(9)


	fmt.Println("front ",queue.front)
	fmt.Println("rear ",queue.rear)
	fmt.Println("data ",queue.data)
}
package queue

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

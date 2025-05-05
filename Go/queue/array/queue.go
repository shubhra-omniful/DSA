package queue

type Queue[T any] struct {
	data  []T
	front int
	rear  int
	size  int
}

func NewQueue[T any]() *Queue[T] {
	queue := new(Queue[T])
	queue.front = -1
	queue.rear = -1
	queue.size = 5
	queue.data = make([]T, queue.size)

	return queue
}

func (queue *Queue[T]) IsEmpty() bool {
	return queue.front == -1 && queue.rear == -1
}

func (queue *Queue[T]) IsFull() bool {
	return queue.front == (queue.rear+1)%queue.size
}

func (queue *Queue[T]) Enqueue(val T) {
	if queue.IsEmpty() {
		queue.front = 0
		queue.rear = 0
	} else if queue.IsFull() {
		panic("queue is full")
	} else {
		queue.rear = (queue.rear + 1) % queue.size
	}

	queue.data[queue.rear] = val
	return
}

func (queue *Queue[T]) Dequeue() T {
	front := queue.front
	if queue.IsEmpty() {
		panic("queue underflow")
	} else if queue.rear == queue.front {
		queue.rear = -1
		queue.front = -1
	} else {
		queue.front = (queue.front + 1) % queue.size
	}

	result := queue.data[front]
	var t T
	queue.data[front] = t
	return result
}

func (queue *Queue[T]) Front() T {
	if queue.IsEmpty() {
		panic("queue is empty")
	}

	return queue.data[queue.front]
}

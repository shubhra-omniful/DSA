package queue

type QueueInterface[T any] interface {
	IsEmpty() bool
	Enqueue(val T)
	Dequeue() T
	Front() T
}
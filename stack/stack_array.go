package main

import "fmt"

type Stack[T any] struct {
	data  []T
	index int
	size  int
}

func NewStack[T any]() *Stack[T]{
	stack := new(Stack[T])

	stack.size = 10 // default size 10
	stack.data = make([]T, stack.size)
	stack.index = -1

	return stack
}

func (stack *Stack[T]) IsEmpty() bool {
	return stack.index == -1
}

func (stack *Stack[T]) Push(t T) {
	stack.index++

	if stack.index == stack.size {
		newData := make([]T, 2*stack.size)
		copy(newData, stack.data)
		stack.size = 2 * stack.size
		stack.data = newData
	}

	stack.data[stack.index] = t
	return
}

func (stack *Stack[T]) Pop() {
	if stack.IsEmpty() {
		panic("stack underflow")
	}

	var zero T
	stack.data[stack.index] = zero
	stack.index--
	return
}

func (stack *Stack[T]) Top() T {
	if stack.IsEmpty() {
		panic("stack is empty")
	}

	return stack.data[stack.index]
}

func main() {
	stack := NewStack[int]()
	numbers := []int{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}

	for _, number := range numbers {
		stack.Push(number)
		fmt.Println("push : ", number)
	}

	for !stack.IsEmpty() {
		fmt.Println("top : ", stack.Top())
		stack.Pop()
	}
}

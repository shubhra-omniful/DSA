package main

import "fmt"

type ArrayList[T any] struct{
	list []T
	size int
	index int
}

func NewArrayList[T any]() *ArrayList[T]{
	arrayList := new(ArrayList[T])
	arrayList.size = 5 // default
	arrayList.list = make([]T, arrayList.size)
	arrayList.index = -1

	return arrayList
}

func (array *ArrayList[T]) IsEmpty() bool {
	return array.index == -1
}

func (array *ArrayList[T]) isFull() bool {
	return array.index + 1 == array.size
}

func (array *ArrayList[T]) isIndexOutOfBounds(index int) bool{
	return index < 0 || index >= array.size || index > array.index
}

func (array *ArrayList[T]) resizeArray() {
	array.size = 2 * array.size

	newArrayList := make([]T,array.size)
	for index := 0; index <= array.index; index++ {
		newArrayList[index] = array.list[index]
	}

	array.list = newArrayList
}

func (array *ArrayList[T]) Append(t T) {
	if array.isFull() {
		array.resizeArray()
	}

	array.index++
	array.list[array.index] = t
	return
}

func (array *ArrayList[T]) Remove(index int) {
	if array.IsEmpty(){
		panic("array is empty")
	}else if array.isIndexOutOfBounds(index){
		panic(fmt.Sprintf("index %d out of bounds", index))
	}

	refacterArray := make([]T,array.size)
	i := 0
	for idx, val := range array.list{
		if idx == index {
			continue
		}

		refacterArray[i] = val
		i++
	}

	array.list = refacterArray
	array.index--

	if array.IsEmpty(){
		array.size = 5 // default
		array.list = make([]T, array.size)
	}

	return
}

func (array *ArrayList[T]) Print() {
	if array.IsEmpty(){
		panic("array is empty")
	}

	for index := 0; index <= array.index; index++ {
		fmt.Println(fmt.Sprintf("index : %d, value : %+v",index,array.list[index]))
	}
}

func (array *ArrayList[T]) SetAt(index int,t T) {
	if array.IsEmpty(){
		panic("array is empty")
	}else if array.isIndexOutOfBounds(index){
		panic(fmt.Sprintf("index %d out of bounds", index))
	}

	array.list[index] = t
	return
}

func (array *ArrayList[T]) GetAt(index int) T{
	if array.IsEmpty(){
		panic("array is empty")
	}else if array.isIndexOutOfBounds(index){
		panic(fmt.Sprintf("index %d out of bounds", index))
	}

	return array.list[index]
}



func main(){
	arrayList := NewArrayList[int]()
	arrayList.Append(1)
	arrayList.Append(2)
	arrayList.Append(3)
	arrayList.Append(4)
	arrayList.Append(5)
	arrayList.Append(6)

	// arrayList.Remove(2)
	// arrayList.Remove(1)
	// arrayList.Remove(1)
	// arrayList.Remove(1)
	// arrayList.Remove(1)
	// arrayList.Remove(0)

	fmt.Println(arrayList.GetAt(0))

	arrayList.SetAt(9,191)

	arrayList.Print()
	fmt.Println("index ",arrayList.index)
	fmt.Println("size ",arrayList.size)
}
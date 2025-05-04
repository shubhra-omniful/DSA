class circular_queue{
    int size;
    int[] arr;
    int front;
    int rear;

    public circular_queue(int size){
        this.size = size;
        arr = new int[size];
    }

    public int size(){
        int count = 0;
        for(int num : arr) if ( num != 0 ) count++;
        return count;
    }

    public boolean enqueue(int value){
        if ( size == 0 || rear < size && arr[rear] != 0 ) return false;

        if ( arr[rear] == 0 ){
            arr[rear] = value;
            rear++;
        }else{
            rear++;
            arr[rear] = value;
        }

        if ( rear == size ){
            rear = 0;
        }

        return true;
    }

    public boolean dequeue(){
        if ( size == 0 || arr[front] == 0 ) return false;

        System.out.println(arr[front]);
        
        arr[front] = 0;
        front++;

        if ( front == size ){
            front = 0;
        }

        return true;
    }

}
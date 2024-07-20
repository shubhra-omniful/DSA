class stack{
    int top;
    int size;
    int[] arr;

    public stack(int size){
        this.size = size;
        top = 0;
        arr = new int[size];
    }

    public int size(){
        return top + 1;
    }

    public boolean peek(){

        if ( top < 0 && top > size ) return false;

        System.out.println(arr[top]);

        return true;
    }

    public boolean pop(){
        if ( size == 0 || top < 0 && top > size || arr[top] == 0 ) return false;

        System.out.println(arr[top]);

        arr[top] = 0;
        if ( top - 1  >= 0 ) top--;
        return true;
    }

    public boolean push(int value){
        if ( size == 0 || top + 1 == size && arr[top] != 0 ) return false;

        if ( arr[top] == 0 ){
            arr[top] = value;
        }else if( top + 1 < size ){
            top++;
            arr[top] = value;
        }

        return true;
    }

}
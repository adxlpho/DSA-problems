class DynamicArray {
    int size;
    int capacity;
    int[] arr;

    public DynamicArray(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        this.arr = new int[capacity];
    }

    // Get value at index i.
    public int get(int i) {
        return arr[i];
    }

    // Set value at index i to n.
    public void set(int i, int n) {
        if (i < size) {
            arr[i] = n;
        }
    }

    // Insert n at the end of the array. If the array is full, resize it first.
    public void pushback(int n) {
        if (size == capacity) {
            resize();
        }
        arr[size] = n;
        size++;
    }

    // Remove the last element from the array and return it. If the array is empty, return some default value (e.g. -1).
    public int popback() {
        if (size > 0) {
            int lastElement = arr[size - 1];
            arr[size - 1] = 0;
            size--;
            return lastElement;
        }
        return -1;
    }

    // Resize the array to double its current capacity.
    public void resize() {
        capacity *= 2;
        int[] newArr= new int[capacity];

        //copy old values to new array
        for(int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    // Get the number of 'real' values in the array (i.e. the number of values that have been inserted).
    public int getSize() {
        return size;
    }

    // Get the capacity of the array (i.e. the size of the underlying fixed size array).
    public int getCapacity() {
        return capacity;
    }
}
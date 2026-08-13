class DynamicArray {
    int size;
    int capacity;
    int[] arr;

    public DynamicArray(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        this.arr = new int[capacity];
    }

    public int get(int i) {
        if (i < size) {
            return arr[i];
        }
        return -1;
    }

    public void set(int i, int n) {
        if (i < size) {
            arr[i] = n;
        }
    }

    public void pushback(int n) {
        if (size == capacity) {
            resize();
        }
        arr[size] = n;
        size++;
    }

    public int popback() {
        if (size > 0) {
            size--;
            return arr[size];
        }
        return -1;
    }

    private void resize() {
        capacity = capacity * 2;
        int[] newArr = new int[capacity];

        // Copy contents to new array
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
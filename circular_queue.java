class circular_queue {
    // implement the class as mentioned in the problem statement above

    int size;
    int[] arr;
    int rear = 0;
    int front = 0;

    circular_queue(int size) {
        this.size = size;
        arr = new int[size];
    }

    boolean enqueue(int data) {
        if (rear != size) {
            arr[rear] = data;
            rear++;
            return true;
        } else {
            return false;
        }

    }

    boolean dequeue() {

        if (front < rear) {
            System.out.println(arr[front]);
            front++;
            return true;
        } else {
            return false;
        }

    }

    int size() {
        return (rear - front);
    }

}

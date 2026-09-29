public interface QueueInterface<T> {
    void enqueue (T element) throws QueueOverflowException;
    //throws exception if queue is full, else, adds element to rear of queue
    T dequeue() throws QueueUnderflowException;
    //throws exception if empty, else, removes front element from queue and returns it
    boolean isFull();
    //if queue is full = true
    //else = false
    boolean isEmpty();
    //if que is empty = true
    //else = false
    int size();
    //returns number of elements in queue

}


class ArrayQueueDemo {
    public static void main(String[] args) {
        ArrayQueue<Integer> q = new ArrayQueue<>();
        q.enqueue(30);
        q.enqueue(60);
        q.enqueue(90);

        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Dequeued: " + q.dequeue());

        /*
        ArrayQueue2<Integer> q = new ArrayQueue2<>();
        q.enqueue(30);
        q.enqueue(60);
        q.enqueue(90);

        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Dequeued: " + q.dequeue());
        // System.out.println("Dequeued: " + q.dequeue());
        */
    }
}
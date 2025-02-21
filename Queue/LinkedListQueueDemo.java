
class LinkedListQueueDemo {
    public static void main(String[] args) {
        LinkedListQueue<Integer> q = new LinkedListQueue<>();
        q.enqueue(30);
        q.enqueue(50);
        q.enqueue(80);
        q.enqueue(100);

        // while(!q.isEmpty()) {
        //     System.out.println("Dequeued: " + q.dequeue());
        // }

        q.enqueue(200);
        q.enqueue(300);
        // System.out.println("Dequeued: " + q.dequeue());
        // System.out.println("Dequeued: " + q.dequeue());

        q.enqueue(500);
        System.out.println("Front: " + q.elementAtFront());
        System.out.println("Front: " + q.elementAtEnd());
    }
}
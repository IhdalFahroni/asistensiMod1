public class Main {
    public static void main(String[] args) throws Exception {
        // Queue q = new Queue();

        // q.enqueue(new Node(1));

        // Node add = new Node(2);
        // q.enqueue(add);

        PriorityQueue prio = new PriorityQueue();
        prio.enqueue(new Node(3));
        prio.enqueue(new Node(4));
        prio.enqueue(new Node(5));
        prio.enqueue(new Node(11));
        prio.enqueue(new Node(12));
        prio.enqueue(new Node(13));

        prio.display();
    }
}

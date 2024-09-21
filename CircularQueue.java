import java.util.PriorityQueue;
public class CircularQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(1);
        pq.add(3);

        System.out.println("Min element: " + pq.peek());
        while (!pq.isEmpty()) {
            System.out.println(pq.poll()); // Removes elements in priority order
        }
    }
}

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Collections {
    public void priority(){
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(15);

        System.out.println("PriorityQueue = "+pq);
        System.out.println("\nPokaż: "+pq.peek());
        System.out.println("Elementy: "+pq);

        System.out.println("\nWyciągnij: "+pq.poll());
        System.out.println("Elementy: "+pq);

        System.out.println("\nPokaż: "+pq.peek());
        System.out.println("Elementy: "+pq);
    }
    public void linkedList(){
        Queue<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(15);

        System.out.println("LinkedList = "+ll);
        System.out.println("\nPokaż: "+ll.peek());
        System.out.println("Elementy: "+ll);

        System.out.println("\nWyciągnij: "+ll.poll());
        System.out.println("Elementy: "+ll);

        System.out.println("\nPokaż: "+ll.peek());
        System.out.println("Elementy: "+ll);
    }
}

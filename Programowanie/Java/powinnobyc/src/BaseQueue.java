import java.util.LinkedList;
import java.util.Queue;

public class BaseQueue {
    public void queue(){
        System.out.println("BaseQueue");
        Queue<Integer> q = new LinkedList<>();

        for (int i=0;i<5;i++){
            q.add(i);
        }
        System.out.println("Elementy "+q);
        System.out.println("Rozmiar "+q.size());

        int rem = q.remove();
        System.out.println("Elementy "+q);
        System.out.println("Rozmiar "+q.size());
        System.out.println(rem);

        int head = q.peek();
        System.out.println("Elementy "+q);
        System.out.println("Rozmiar "+q.size());
        System.out.println(head);

        for (int i=head;i<5;i++){
            System.out.println("#"+i+" "+q.poll());
            System.out.println("head "+head);
            System.out.println("Pozostało "+q);
        }
    }
}

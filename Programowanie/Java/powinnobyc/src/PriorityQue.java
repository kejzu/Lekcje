import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQue {
    public void priority(){
        Queue<String> pq = new PriorityQueue<>();
        System.out.println("Rejestracja na zawody LOL");
        //zespół 1
        pq.add("Adam");
        pq.add("Karas");
        pq.add("Pawel");
        pq.add("Wiktoria");

        //zespol 2
        pq.add("Bepti");
        pq.add("Cumil");
        pq.add("Mati");
        pq.add("Ruslan");

        System.out.println(pq);
        System.out.println(pq.size());

        Iterator iterator = pq.iterator();
        int i = 0;

        System.out.println("Zespol 1");
            while (iterator.hasNext()){
                System.out.println("#"+(i++)+"="+iterator.next());
            }
        System.out.println("Zespol 2");
            while (iterator.hasNext()){
                System.out.println("#"+(i++)+"="+iterator.next());
                if (i==4){
                    break;
                }
            }
    }

    public void removing(){
        Queue<String> pq = new PriorityQueue<>();
        Queue<String> pq2 = new PriorityQueue<>();

        pq.add("Coring");
        pq.add("is");
        pq.add("Boring");

        pq2.add("Geeks");
        pq2.add("For");
        pq2.add("Geeks");

        System.out.println(pq);
        System.out.println(pq2);

        pq2.remove("Geeks");
        pq.remove("Boring");

        System.out.println("Kolejka 1: "+pq);
        System.out.println("Kolejka 2: "+pq2);
        System.out.println("Metoda poll: "+pq.poll());
        System.out.println("Metoda poll: "+pq2.poll());
        System.out.println("Kolejka 1: "+pq);
        System.out.println("Kolejka 2: "+pq2);


    }
}

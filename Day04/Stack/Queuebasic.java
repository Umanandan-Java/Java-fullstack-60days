package Stack;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Iterator;
public class Queuebasic {
    public static void main(String[] args) {
        Queue q = new PriorityQueue();
            q.add(1);
            q.add(3);
            q.add(5);
            q.add(2);
            q.add(4);

            Iterator it = q.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }
    }
}

package Day6;

import java.util.PriorityQueue;

public class D6_P7_Priority_Queue {
    public static void main(){
        PriorityQueue<Integer> pQ = new PriorityQueue<>();
        pQ.add(12);
        pQ.add(2);
        pQ.add(3);
        pQ.add(1);

        System.out.println(pQ.peek());
    }
}

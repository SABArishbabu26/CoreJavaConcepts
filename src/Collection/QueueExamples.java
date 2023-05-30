package Collection;

import java.util.*;

public class QueueExamples {
    public void queueEx(){
        Queue<String> q = new ArrayDeque<>();
        q.add("saba");
        q.offer("babu");
        q.add("vijay");
        q.offer("dany");

        System.out.println(q);

        List<String> list = new LinkedList<>(q);
        q.clear();
        Collections.sort(list);
        System.out.println("Sorted queue:");
        for (String s: list){
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        QueueExamples qe = new QueueExamples();
        qe.queueEx();
    }
}

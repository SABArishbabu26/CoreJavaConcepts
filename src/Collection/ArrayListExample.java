package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
    public void arrayList(){
        List<String> ar = new ArrayList<>();
        ar.add("saba");
        ar.add("babu");
        ar.add("vijay");
        ar.add("raja");
        ar.add("sunil");
        ar.add("kumar");
        ar.add("tamil");

        System.out.println(ar);

        Collections.sort(ar);
        System.out.println("Sorted list: "+ ar);

        System.out.println(ar.size());

        System.out.println(ar.contains("babu"));

        System.out.println(ar.isEmpty());

        ar.remove("vijay");
        System.out.println(ar);

        int i = ar.indexOf(4);
        System.out.println(i);

        for (String s: ar){
            System.out.println(s);
        }
    }
    public void linkedlist(){
        
    }

    public static void main(String[] args) {
        ArrayListExample al = new ArrayListExample();
        al.arrayList();
    }
}

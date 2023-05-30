package Collection;

import java.util.*;

public class ListExamples {
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

        /*Collections.sort(ar);
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
        }*/

        // Converting arraylist to array

        String[] arr = new String[ar.size()]; // creating an array with size of arraylist
        ar.toArray(arr); //convert
        System.out.println("Array elements are:");
        for (String s:arr){
            System.out.println(s);
        }


    }
    public void linkedList(){
        List<Integer> link = new LinkedList<>();
        link.add(1);
        link.add(83);
        link.add(5237);
        link.add(00);
        link.add(5);
        link.add(373);

        System.out.println(link);

        Iterator<Integer> iterator = link.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        ListExamples al = new ListExamples();
        al.arrayList();
        //al.linkedList();
    }
}

package Collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

public class StackExample {
    public void stackExample(){
        Stack<Integer> st = new Stack<>();
        st.add(1);
        st.push(9);
        st.add(5);
        st.push(876576);
        st.add(554);
        st.add(966);

        //Collections.sort(st);
        System.out.println(st.peek());
        System.out.println(st.pop());

        String name = "sabarish";
        char[] arr = name.toCharArray();
        Stack<String> stack = new Stack<>();

        for(char s:arr){
            stack.push(String.valueOf(s));
        }
        System.out.println(stack);

        Collections.reverse(stack);
        System.out.println(stack);
    }

    public static void main(String[] args) {
        StackExample se = new StackExample();
        se.stackExample();
    }
}

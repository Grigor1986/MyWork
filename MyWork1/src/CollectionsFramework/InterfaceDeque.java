package CollectionsFramework;

import java.util.ArrayDeque;
import java.util.Deque;

public class InterfaceDeque {
    public static void main(String[] args) {
        Deque<String> states = new ArrayDeque<>();
        states.add("Germany");
        states.add("France");
        states.push("US");
        states.offerLast("Norway");
        System.out.println(states);

        String sFirst = states.pop();
        String s = states.peek();
        String sLast = states.peekLast();
        states.offer(sFirst);
        String s1 = states.pollLast();
        while (states.peek() != null) {
            System.out.print(states.pop());
        }
    }
}


import java.util.*;

public class Test5 {

    // Interleve 2 Halves of a Queue (even length)
  // input Queue is : 1 2 3 4 5 6 7 8 9 10
  //   output Queue : 1 6 2 7 3 8 4 9 5 10 

    public static void interLeave(Queue<Integer> q) {
        Queue<Integer> first = new LinkedList<>();
        int size = q.size() / 2;
        for (int i = 0; i < size; i++) {
            first.add(q.remove());
        }
        while (!first.isEmpty()) {
            q.add(first.remove());
            q.add(q.remove());

        }

    }

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        interLeave(q);

        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
    }

}

import java.util.PriorityQueue;
class HelloWorld {
    
    // creating a PriorityQueue 

  
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(2);
        pq.add(10);



        while(!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}

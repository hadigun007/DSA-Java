package Queue;

import java.util.*;;

public class Main {
    public static void main(String[] args) {
    System.out.print("=======================\n\n");
    Queue<String> queue = new LinkedList<String>();
    queue.add("Footbal");
    queue.add("Basketbal");
    queue.add("Tennis");
    queue.offer("Swimming");
    queue.poll();
    queue.remove();
    
    
    System.out.println(queue);
    System.out.println("Length of Queue: " + queue.size());
    System.out.println("First item " +  queue.peek());
    System.out.println("Is Empty: " +  queue.isEmpty());
    System.out.println("Is Contain Tennis:  " +  queue.contains("Tennis"));



    System.out.print("\n=======================\n");
    
    }
}

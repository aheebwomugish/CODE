import java.util.LinkedList;
public class LQueues {
    LinkedList<Integer> list = new LinkedList<Integer>();

    public void enqueue(int val) {
        list.addLast(val);
    }
    public void dequeue() {
        list.removeFirst();
    }

    public void show() {
        for(int x = 0; x < list.size(); x++) {
            System.out.println(list.get(x));
        }
    }

    public static void main(String[] args) {
        LQueues queue = new LQueues();

        // Adding values to the queue.
        queue.enqueue(25);
        queue.enqueue(232);;
        queue.enqueue(11);
        queue.enqueue(10);
        queue.show();
        System.out.println("\n");
        // Removing the value that was first added to the queue.(25)
        queue.dequeue();
        queue.show();
    }
}

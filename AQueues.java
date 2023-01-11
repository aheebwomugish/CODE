import java.util.Arrays;

public class AQueues {
    int[] array;
    int size;
    int position = 0;
    public AQueues(int _size) {
        this.size = _size;
        this.array = new int[_size];
    }

    public void enqueue(int val) {
        if(checkFull() == false) {
            array[position] = val;
            position++;
        } else if(checkFull() == true) {
            System.out.println("Queue is full!");
        }
    }
    public void dequeue() {
        for (int i = 0; i < array.length-1; i++) {
            if(array[i+1] == 0) {
                array[i] =array[i+1];
                return;
            }
            array[i] =array[i+1];
        }
        array[size-1] = 0;

        position--;
    }

    public boolean checkFull() {
        if(array[size-1] != 0) {
            return true;
        }
        return false;
    }

    public void show() {
       System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        AQueues queue = new AQueues(3);
       
        // Adding values to the queue.
        queue.enqueue(38);
        queue.enqueue(11);
        queue.enqueue(89);
        queue.show();
        // Adding to a full Queue;
        queue.enqueue(232);
        System.out.println("\n");
        // Removing the value that was first added to the queue.(38)
        queue.dequeue();
        queue.enqueue(33);
        queue.show();
    }
}

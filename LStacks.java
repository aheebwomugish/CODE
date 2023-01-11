import java.util.LinkedList;

public class LStacks {
    LinkedList<String> list = new LinkedList<String>();
    //Removes a value from a stack.
    void pop() {
        list.removeLast();
    }
    // Adds a value to a stack.
    void push(String value) {
        list.addLast(value);
    }

    // Shows all values in the stack.
    void show() {
        for(int x = 0; x < list.size(); x++) {
            System.out.println(list.get(x));
        }
    }
    public static void main(String[] args) {
        LStacks stack = new LStacks();
        // Adds hello and world to the stack.
        stack.push("Hello");
        stack.push("World");
        stack.push("I");
        stack.push("am");
        stack.push("amazing!");
        stack.show();
        // Removes "amazing!" from the stack.
        stack.pop();
        System.out.println("\n");
        stack.show();

    }
}

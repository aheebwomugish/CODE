public class AStacks {
public int push(int a){
    return a;

}
    public static void main(String[] args) {
        AStacks stack = new AStacks();
        AStacks  st = new AStacks();
        stack.push(2);
        stack.push(3);

        System.out.println(st.push(30));
        System.out.println(stack.push(3));
        System.out.println(st.push(43));
        System.out.println(st.push(34));
        System.out.println(stack.pop());


    }

    private int pop() {
        return 0;
    }
}

public class Stacks {
public int push(int a){
    return a;

}
    public static void main(String[] args) {
        Stacks stack = new Stacks();
        Stacks  st = new Stacks();
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

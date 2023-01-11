// deleting element from array

import java.util.Arrays;

public class Deletion {
    public static void main(String[] args) {
        String[] s = {"adrine","phyllis", "sasha", "beth"};
        int removeIndex = 1;
        for (int i = removeIndex; i < s.length - 1; i++) {
            s[i]=s[i+1];

        }
        s[s.length -1] = null;

        System.out.println("new array after deletion is" + Arrays.toString(s));
    }
}

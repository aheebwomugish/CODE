// deleting element from array

import java.util.Arrays;

public class Deletion {
    public static void main(String[] args) {
        String[] s = {"adrine", "phllis", "sasha", "beth"};
        int removeIndex = 1;
        for (int i = removeIndex; i < s.length - 1; i++) {
            s[1]=s[i+1];
        }
        System.out.println("new array after deletion is" + Arrays.toString(s));
    }
}

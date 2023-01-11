
import java.util.Arrays;
public class InsertTraversal {
    public static void main(String[] args) {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49, 0};

        // Insert an element in 3rd position of the array (index->2, value->5)

        int Index_position = 2;
        int newValue    = 5;

        System.out.println("Original Array : "+Arrays.toString(my_array));

        for(int i=my_array.length-1; i > Index_position; i--)
        {
            my_array[i] = my_array[i-1];
        }

        my_array[Index_position] = newValue;
        System.out.println("New Array: "+Arrays.toString(my_array));

//merging 2 arrays
        int [] array2 = {5,6,7,8};
       int a1= my_array.length;
       int a2= array2.length;
       int c = a1 + a2;
       int[] A = new int [c];
       System.arraycopy(my_array, 0, A, 0, a1);
       System.arraycopy(array2,0, A, a1, a2);
        System.out.println(Arrays.toString(A));


        //traversing an array
        String[] S = {"23","24","25"};
        for (String element: S) {
            System.out.println(element);
        }
       //2d array




    }
}


import java.util.Arrays;

public class SelectionSort {
    // Sorting an array in ascending order.
    public int[] sortArray(int[] array) {
            for (int x = 0; x < array.length; x++) {
                int minIndex = x;
                for(int y = x+1; y < array.length; y++) {
                    if(array[y] < array[minIndex]) {
                        minIndex = y;
                    }
                }
                int temp = array[minIndex];
                array[minIndex] = array[x];
                array[x] = temp;
            }
            return array;
    }

    public static void main(String[] args) {
        SelectionSort sort = new SelectionSort();
        int[] unsorted = {7,3,35,4,1,45};
        int[] sorted =  sort.sortArray(unsorted);
        System.out.println(Arrays.toString(sorted));
    }
}

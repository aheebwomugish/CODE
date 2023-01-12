import java.util.Arrays;

public class BubbleSort {
    public int[] bubbleSort(int[] arr) {
        int n = arr.length;
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                // Sorting in an array is done in one step for all values for each iteration. 
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort();
        int[] unsorted = {1,24,323,46,33,345,21};
        int[] sorted = sort.bubbleSort(unsorted);
        System.out.println(Arrays.toString(sorted));
    }    
    
}

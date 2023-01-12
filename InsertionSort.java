import java.util.Arrays;

public class InsertionSort {
    
    public int[] insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
     
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    public static void main(String[] args) {
        InsertionSort sort = new InsertionSort();
        int[] unsorted = {7,3,35,4,1,45};
        int[] sorted =  sort.insertionSort(unsorted);
        System.out.println(Arrays.toString(sorted));
    }
    
}

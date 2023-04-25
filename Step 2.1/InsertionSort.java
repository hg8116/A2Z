public class InsertionSort {
    void insertionSort(int[] arr, int n){
        for(int i=0; i<n; i++){
            int item = arr[i];
            int j=i;
            while(j > 0 && item < arr[j-1]){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = item;
        }
    }
}

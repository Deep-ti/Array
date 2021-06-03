public class Quicksort {
    private NullPointerException nullPointerException;

    public int[] sort(int[] unsorted) throws NullPointerException {
        if(unsorted == null || unsorted.length == 0){
            throw nullPointerException;
        }
        quicksort(0, unsorted.length-1, unsorted);
        return unsorted;
    }

    private void quicksort(int low, int high, int[] unsorted) {
        if(low < high){
            int pi = partion(low, high, unsorted);
            quicksort(low, pi-1, unsorted);
            quicksort(pi+1, high, unsorted);
        }
    }

    private int partion(int low, int high, int[] unsorted) {
        int pivot = unsorted[high];
        int i = low-1;
        for(int j = low; j < high; j++){
            if(unsorted[j] < pivot){
                i++;
                swap(i, j, unsorted);
            }
        }
        swap(i+1, high, unsorted);
        return i+1;
    }

    private void swap(int i, int j, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

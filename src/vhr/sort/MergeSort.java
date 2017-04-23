package vhr.sort;

public class MergeSort {

    public static void main(String args[]) {

    }

    public int[] mergeSort(int[] array, int begin, int end) {
        if(begin==end || array==null){
            return null;
        }
        int mid = (begin + end) / 2;
        mergeSort(array,begin, mid);
        mergeSort(array, mid+1, end);
        
       
        
    }
    
    public int[] merge(int [] array, int begin, int end, int mid){
        
    }
}

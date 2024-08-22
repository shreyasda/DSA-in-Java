package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] array){
        int n = array.length;
        if(n < 2){
            return;
        }
        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];
        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }
        for (int i = mid; i < n; i++) {
            right[i - mid] = array[i];
        }

        mergeSort(left);
        mergeSort(right);
        merge(left,right,array);
    }
    public static void merge(int[] left, int[] right, int[] array){
        int sizeOfLeft = left.length;
        int sizeOfRight = right.length;
        int i = 0, j = 0, k = 0;

        while((i < sizeOfLeft) && (j < sizeOfRight)){
            if(left[i] < right[j]){
                array[k] = left[i];
                i++;
            }
            else{
                array[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < sizeOfLeft){
            array[k] = left[i];
            i++;
            k++;
        }

        while (j < sizeOfRight){
            array[k] = right[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        int[] array = {2,4,1,6,8,5,3,7};
        System.out.println("Unsorted Array: "+ Arrays.toString(array));
        mergeSort(array);
        System.out.println("Sorted Array: "+ Arrays.toString(array));
    }
}

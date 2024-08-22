package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] array, int start, int end){
        if(start < end){
            int partitionIndex = Partition(array, start, end);
            quickSort(array, start, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, end);
        }
    }

    public static int Partition(int[] array, int start, int end){
        int pivot = array[end];
        int partitionIndex = start;

        for (int i = start; i < end; i++) {
            if(array[i] <= pivot){
                int temp = array[i];
                array[i] = array[partitionIndex];
                array[partitionIndex] = temp;
                partitionIndex++;
            }
        }
        int temp = array[partitionIndex];
        array[partitionIndex] = array[end];
        array[end] = temp;
        return partitionIndex;
    }

    public static void main(String[] args) {
        int[] array = {2,4,1,6,8,5,3,7};
        System.out.println("Unsorted Array: "+ Arrays.toString(array));
        quickSort(array,0,7);
        System.out.println("Sorted Array: "+ Arrays.toString(array));
    }
}

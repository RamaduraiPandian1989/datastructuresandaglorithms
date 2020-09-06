/**
 * 
 */
package test.list;

import java.util.Arrays;

/**
 * @author Ramad
 *
 *Quick Sort works on divide and Conquer mechanism, for each list there will be pivot , items towards left and
 *right of pivot will be sorted
 *
 *
 */
public class QuickSortRightPivot {
	
	
	public static void quickSort(int[] arr, int start, int end){
		 
        int partition = partition(arr, start, end);
 
        if(partition-1>start) {
            quickSort(arr, start, partition - 1);
        }
        if(partition+1<end) {
            quickSort(arr, partition + 1, end);
        }
    }
	
	public static int partition(int[] arr, int start, int end){
        int pivot = arr[end];
 
        for(int i=start; i<end; i++){
            if(arr[i]<pivot){
                int temp= arr[start];
                arr[start]=arr[i];
                arr[i]=temp;
                start++;
            }
        }
 
        int temp = arr[start];
        arr[start] = pivot;
        arr[end] = temp;
 
        return start;
    }

	public static void main(String ar[])
	{
		
		int[] unSortedArray = {10,50,90,60,30,70};
		System.out.println("Unsorted One");
		System.out.println(Arrays.toString(unSortedArray));
		quickSort(unSortedArray,0,unSortedArray.length-1);
		System.out.println("Sorted One");
		System.out.println(Arrays.toString(unSortedArray));
		
	}

}

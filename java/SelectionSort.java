
import java.util.Arrays;

public class SelectionSort {
	
	public void sort(int[] unsorted)
	{
		System.out.println("Selection Unsorted Collection");
		System.out.println(Arrays.toString(unsorted));
		int n=unsorted.length;
		for(int i=0;i<n-1;i++)
		{
			int lower=i;
			 for (int j = i+1; j < n; j++)
			 {
				 if (unsorted[j] < unsorted[lower])
	                    lower = j;
				 
				 int temp = unsorted[lower];
				 unsorted[lower] = unsorted[i];
				 unsorted[i] = temp;
			 }
		}
		System.out.println("Selection Sorted Collection");
		System.out.println(Arrays.toString(unsorted));
	}

	public static void main(String[] args) {
		
		int[] unsorted = {64, 25, 12, 22, 11};
		new SelectionSort().sort(unsorted);
		

	}

}

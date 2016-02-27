package SamplesImpl;

import java.lang.reflect.Array;
import java.util.Arrays;




//Finding the minimum element and iterate over it form the sub array which is not sorted.
public class SelectionSort {

	
	public static void swap(int arr, int arr2)
	{
		int temp=arr;
		arr=arr2;
		arr2=temp;
		
	}
	
	public static int[] Solution(int arr[],int n)
	{
		
		int i,j,min_idx;
		for (i = 0; i < n-1; i++)
	    {
	        // Find the minimum element in unsorted array
	        min_idx = i;
	        for (j = i+1; j < n; j++)
	        {
	          if (arr[j] < arr[min_idx])
	          {
	            min_idx = j;
	          }
	        }
	        // Swap the found minimum element with the first element
	        swap(arr[min_idx], arr[i]);
	    }
		
		return arr;
	}
	
	public static void main(String args[])
	{
		
		int a[]={8, 3, 5, 10, 1};
		int x=10;
		int l=0;
		int r=a.length;
		System.out.println(r);
		
		System.out.println(Arrays.toString(Solution(a, r)));
		}
		
		
		
	
	
	

}

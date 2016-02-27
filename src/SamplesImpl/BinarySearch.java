package SamplesImpl;



//Binary Search By Arpit
//Linear Search
//Start left most of the element of arr[] and one by one compare each element of the x if matches with an element then return the index
public class BinarySearch {

	
	
	public static int BinarySearch1(int a[],int l,int r, int x)
	{
		
		//In the Divide and conquer Algorithms
		
		//l<=r
		//m=l+(r-1)/2
		
		
		
		
		
		if(r>=1)
		{
			int mid=1+(r-1)/2;
			
			if(a[mid]==x)
				return mid;
			
			if(a[mid]>x)
			{
				return BinarySearch1(a, l, mid-1, x);
			}
			else
			{
				return BinarySearch1(a, mid+1, r, x);
			}
		}
		
		
		return -1;
		
	}
	
public static void main(String args[])
{
	
	int a[]={2, 3, 4, 10, 40};
	int x=10;
	int l=0;
	int r=a.length;
	System.out.println(r);
	
	System.out.println(BinarySearch1(a, l, r, x));
	}
	
	
	
}
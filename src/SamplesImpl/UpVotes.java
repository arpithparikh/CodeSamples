package SamplesImpl;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class UpVotes {
	
	public static void main(String args[]) throws FileNotFoundException
	{
		
		System.out.println(Solution());
		
	}
	
	
	
	
	
	public static  int Solution() throws FileNotFoundException
	{
		Scanner scanner=new Scanner(new File("C:/Interview/Demo/src/abc.txt"));
		int first[]=new int[100];
		int i=0;
		int N=0;
		int K=0;
		while(scanner.hasNext())
		{
			first[i++]=scanner.nextInt();
		}
	
		N=first[0];
		K=first[1];
		
		
		int mA[]=new int[N];
		for(int l=0;l<=N;l++)
		{
			mA[0]=first[N+2];
		
		}
		
		System.out.println(Arrays.toString(first));
		
		int windowSize=(K*(K-1))/2;
		int counter=0;
		int array[]=new int[windowSize+1];
		
		for(int j=0;j<=N;j++)
		{

			for(int k=j;k<windowSize;k++)
			{
					if(mA[k]-K+1>0)
					{
						counter++;	
					}
					else
					{
						counter--;
					}
									
			}
		System.out.println(counter);	
	
		}
		return counter;
		
	}

}

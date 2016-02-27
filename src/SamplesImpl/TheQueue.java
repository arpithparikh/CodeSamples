package SamplesImpl;
import java.util.Arrays;

public class TheQueue {
	
	
	//store the the value in the String array
	private String[] queueArray;
	
	//Queue Size
	private int queueSize;
	
	//font, rear, numberofItems
	private int font,rear,numberofItems=0;
	
	//Constructor with integer size 
	TheQueue(int size)
	{
		queueSize=size;
		queueArray=new String[size];
		Arrays.fill(queueArray,"-1");
	}
	
	public void insert(String input)
	{
		if(numberofItems+1<=queueSize)
		{
			queueArray[rear]=input;
			rear++;
			numberofItems++;
			System.out.println();
			
		}
		else
		{
			
		}
		
	}
	
	public static void main(String[] args)
	{

		
	}

	
	
}

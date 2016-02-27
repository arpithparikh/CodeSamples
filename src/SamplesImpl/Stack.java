package SamplesImpl;
import java.util.Arrays;

public class Stack {
	
	//to store the value
	private String[] array;
	
	//to check the stack
	private int stackSize;
	
	//to get reference of the stack
	private int topOfStack=-1;
	
	//Constructor 
	Stack(int size)
	{
		stackSize=size;
		array=new String[size];	
		Arrays.fill(array,"-1");
		
		
	}
	
	public void push(String input)
	{
		if(topOfStack+1<stackSize)
		{
			topOfStack++;
			array[topOfStack]=input;
		}
		else
		{
			System.out.print("Sorry But the Stack is Full");
			displayTheStack();
			System.out.println("PUSH"+input+"was Added to the");
		}
	}
	
	
	public String pop()
	{
		if(topOfStack>=0)
		{
			displayTheStack();
			System.out.println("POP"+array[topOfStack]+"removed");
			array[topOfStack]="-1";
		
			return array[topOfStack--];
		}
		else
		{
			displayTheStack();
			System.out.println("Sorry but the stack is empty.");
			return "-1";
		}
	}
	
	public String peek()
	{
		displayTheStack();
		System.out.println("PEEK"+array[topOfStack]+"is at the top of the stack");
		return array[topOfStack];
	}
	
	
	// TODO Auto-generated method stub
	private void displayTheStack() 
	{
		
		
		
	}

	public static void main(String args[])
	{
		
		Stack stack=new Stack(10);
		stack.push("10");
		
	}

}

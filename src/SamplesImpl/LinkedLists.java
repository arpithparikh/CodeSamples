package SamplesImpl;
public class LinkedLists {
	
	static class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			data=d;
			next=null;
		}
			
	}	
	static Node head1,head2;
	
	Node addTwoLists(Node first,Node second)
	{
		
		Node res=null; //head node for resultant list.
		Node prev=null;
		Node temp=null;
		int carry=0,sum;
		
		while(first!=null || second!=null)
		{
		
			sum=carry +(first!=null ?first.data:0)
					+ (second!=null ?second.data:0);
			
			carry =(sum>=10)? 1:0;
			sum=sum%10;
			temp=new Node(sum);
			
			
			
		}
		
		
		
		
		
		
		
		return second;
		
	}
	
	
	
	

}

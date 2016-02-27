package SamplesImpl;
import java.util.HashMap;


public class Test {

	
	public static String MaxLength(String abc[])
	{
		String maxLengthString=null;
		int maxLength=0;
		
		for(int i=0;i<abc.length;i++)
		{
			if(maxLength<abc[i].length())
			{
				maxLength=abc[i].length();
				maxLengthString=abc[i];
			}
		}
		
		
		return maxLengthString;
		
	}
	
	
	
	public static int MaxSolution(int P[],int Q[])
	{
		
		 
	      HashMap<Integer,Integer> has=new HashMap<Integer,Integer>();
	      
	      for(int i=0;i<P.length;i++)
	      {
	          for(int j=0;j<Q.length;j++)
	          {
	              has.put(P[i],Q[j]);
	             }
	         }
	
	      
	      return has.size();
	
	}
	
	
	public static void main(String args[])
	{
		
		
		String[] abc={"abc","abdd","eeed"};
		
		System.out.println(Test.MaxLength(abc));
		
		
		int P[]={2,5,0};
		int Q[]={4,5,6};
		
		
		System.out.println(Test.MaxSolution(P, Q));
	}
	

}

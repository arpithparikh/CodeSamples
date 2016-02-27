package SamplesImpl;

public class Test1 {

	public static boolean URLfiy(String a)
	{
		
		if(a.length()>128)
			return false;
		
		boolean char_set[]=new boolean[128];
		
		
			for(int i=0;i<a.length();i++)
			{
				int val=a.charAt(i);
				if(char_set[val])
				{
					System.out.println(char_set[val]);
					return false;
				}
				char_set[val]=true;
			}
	
		
		
		
		return false;
	}
	
	
	
	
	public static void main(String args[])
	{
		
		String abc="aabc";
		
		System.out.println(Test1.URLfiy(abc));
		
		
	}
}

package SamplesImpl;


import java.util.Stack;

public class StackMachine
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		System.out.println(('+' - '0')  );
//		System.out.println(('9' - '0')  );
//		System.out.println(('*' - '0')  );
		
		
		String input0 = "13+62*7+*";
		
		String input1 = "13+62*7++";
		
		
		System.out.println("Stack Machine : " + stack_machine_emulator(input0));
		
		System.out.println("Stack Machine : " + stack_machine_emulator(input1));
		
	}

	
	
	
	/**
	 * A Stack Machine is a simple system that performs arthmetic operations on an input string of numbers and operators. It contains a stack that can 
	 * store an arbitrary number of 12-bit unsigned integers. The machine processes a string of characters in the following way :
	 * - the characters of a string are processed one by one ;
	 * - if the current character is a digit  (0-9) the machine pushes the value of that digit onto its stack ;
	 * - if the current character is "+" , the machine pops two topmost values from its stack , adds them and pushes result onto its stack ;
	 * - if the current character is "*" the machine pops two topmost values from its stack multiplies them and pushes result onto its stack ;
	 * RESULT
	 * - after the machine has processed the whole string it returns the topmost value of its stack as the result
	 * ERRORS
	 * - the machine reports an error if any operation it performs (addition or multiplication) results  in an overflow  or underflow
	 * - the machine reports an error if it tries to pop an element from its stack when the stack is empty
	 * 
	 *   For example given the string "13+62*7+*" the machine will perform the following operations : 
	 *   
	 *   character	| comment 
	 *   ----------------------------------
	 *   '1'		| push 1 onto the stack				[1]
	 *   '3'		| push 3 onto the stack				[1,3]
	 *   '+'		| performs addition		=> 4		[4]
	 *   '6'		| push 6 onto the stack				[4,6]
	 *   '2'		| push 2 onto the stack				[4,6,2]
	 *   '*'		| performs multiplication			[4,12]
	 *   '7'		| push 7 onto the stack				[4,12,7]
	 *   '+'		| performs addition		=> 19		[4,19]
	 *   '*'		| performs multiplication =>76		[76]
	 *   
	 *   the stack machine will return 76 as the result as its topmost element of its stack. 
	 *   
	 *   write a function class Solution { public int stack_machine_emulator(String S) {....} }
	 *   
	 *   that, given a string S consists of N characters containing input for the stack machine,
	 *   returns the result the machine would return if given this string . The function should return -1
	 *   if the machine would report an error when processing the string.
	 *   
	 *   For example, given string S="13+62+7+*" the function should return 76 , as explained in the example above.
	 *   Given string S="11++" should return -1
	 *   
	 *   Assume that :
	 *   - the length of S is withint the range [0...1 000 000];
	 *   - string S consists only  of the characters [0..9] '+' | '*'
	 *   
	 *   Complexity : 
	 *   - expected worst case time complexity is O(N);
	 *   - expected worst case space complexity is O(N) (not counting the storage requirements for input arguments)
	 *   - 
	 * @param s
	 * @return
	 */
	public static int stack_machine_emulator(String s)
	{
		//trzeba zainicjalizować stos
		Stack<Integer> st = new Stack<>();
		
		for(int i = 0; i < s.length(); i++)
		{
			char curr = s.charAt(i);
			if(curr - '0' >= 0)//to jest liczba
			{
				st.push(curr - '0');
			}
			else if(st.size() >= 2)//stos zawiera co najmniej 2 elementy, więc można wykonać działanie 
			{
				if(curr - '0' == -5)//+
				{
					st.push( st.pop() + st.pop()   );
				}
				else//*
				{
					st.push( st.pop() * st.pop()   );
				}
			}
			else
			{
				return -1;//kolejny element jest znakiem, ale stos był pusty
			}
		}
		
		if(st.size() == 1)
			return st.pop();
		
		
		return -1;
	}	
	
	
	
}
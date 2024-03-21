package Equations;
import java.util.*;
public class postfix_conversion 
{
	public static int precedence(char c) 
	{
		switch(c)
		{
			case '+':
			case '-':
				return 1;
			case '*':
			case '/':
				return 2;
			case '^':
				return 3;
		}
        return -1;
	}
	public static String infixtopostfix(String infix)
	{
		String postfix=new String("");
		Stack<Character> stack=new Stack<Character>();
		for(int i=0;i<infix.length();i++)
		{
			char t=infix.charAt(i);
			if(Character.isLetterOrDigit(t))
				postfix+=t;
			else
			{
				if(t=='(')
					stack.push(t);
				else if(t==')')
					while(!stack.isEmpty()&&stack.peek()!='(')
						postfix+=stack.pop();
				else
				{
					while (!stack.isEmpty()&&precedence(t)<=precedence(stack.peek()))
						postfix+=stack.pop();
					stack.push(t);
				}
			}				
			
		}
		while (!stack.isEmpty()) 
            postfix+=stack.pop();        
		return postfix;
	}
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Infix Expression: ");
		String infix = in.next();
		String postfix=infixtopostfix(infix);
		System.out.println("\nThe postfix expression is: "+postfix);
	}
}

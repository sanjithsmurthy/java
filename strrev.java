import java.util.*;
public class strrev 
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		String Forward = in.next();
		Stack<Character> stack = new Stack<>();
		int i=0;
		for(i=0;i<Forward.length();i++)
			stack.push(Forward.charAt(i));
		String Backward="";
		while(!stack.isEmpty())
			Backward+=Character.toString(stack.pop());
		System.out.println("FORWARD: "+Forward+"\nBACKWARD: "+Backward);
		if(Forward.equalsIgnoreCase(Backward))
			System.out.println("Pallindrome");
		for(char a='a';a<='z';a++)
		{
			int count=0;
			for(i=0;i<Forward.length();i++)
				if(Forward.charAt(i)==a)
					count++;
			if(count!=0)
				System.out.println(a+" occurs "+count+" times");
		}
		for(int n=0;i<10;n++)
		{
			int count=0;
			for(i=0;i<Forward.length();i++)
				if(Character.getNumericValue(Forward.charAt(i))==n)
					count++;
			if(count!=0)
				System.out.println(n+" occurs "+count+" times");
		}
		
	}

}

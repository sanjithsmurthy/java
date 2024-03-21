package Program2;
import java.util.*;
public class student 
{
	private String USN;
	private String Name;
	private String Branch;
	private String PN;
	public void read()
	{
		Scanner in = new Scanner(System.in);
		USN=in.next();
		Name=in.next();
		Branch=in.next();
		PN=in.next();
	}
	public void display()
	{
		System.out.println(USN+"\t"+Name+"\t"+Branch+"\t"+PN);
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n,i;
		System.out.println("Enter number of students");
		n=in.nextInt();
		student[] s = new student[n];
		for(i=0;i<n;i++)
		{
			System.out.println("Enter student "+(i+1)+" details");
			s[i]=new student();
			s[i].read();
		}
		System.out.println("The student details\nUSN\tNAME\tBRANCH\tPHONE NUMBER");
		for(i=0;i<n;i++)
			s[i].display();
		
	}
}

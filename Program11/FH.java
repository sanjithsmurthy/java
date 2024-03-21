package Program11;
import java.io.*;
import java.util.*;
public class FH 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String fname=in.next();
		File f = new File(fname);
		System.out.println("The name of the file is "+f.getName());
		f.setWritable(false);
		System.out.println(f.exists()?"file exists":"file does not exist");
		System.out.println(f.canRead()?"File readable":"File is not readable");
		System.out.println(f.canWrite()?"File writable":"File is not writable");
		String filename=f.getName();
		int index=filename.lastIndexOf('.');
		if(index>0)
		{
			String type=filename.substring(index+1);
			System.out.println("The file type is "+type);
		}
		else
			System.out.println("The file doesn't have type");
		System.out.println("File size is "+f.length()+" bytes");
	}
}

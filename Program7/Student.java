package Program7;
public class Student implements resume 
{
	public String Name;
	public String Result;
	public String Discipline;
	Student(String N,String R,String D)
	{
		Name=N;
		Result=R;
		Discipline=D;
	}
	public void biodata()
	{
		System.out.println("Name: "+Name+"\tResult: "+Result+"\tDiscipline: "+Discipline);
	}
}

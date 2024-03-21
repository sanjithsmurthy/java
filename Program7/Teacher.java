package Program7;
public class Teacher implements resume
{
	public String Name;
	public String Qualification;
	public int Experience;
	public String Achievements;
	Teacher(String N,String Q,int E,String A)
	{
		Name=N;
		Qualification=Q;
		Experience=E;
		Achievements=A;
	}
	public void biodata()
	{
		System.out.println("Name: "+Name+"\tQualification: "+Qualification+"\tExperience: "+Experience+"\tAchievements: "+Achievements);
	}
}

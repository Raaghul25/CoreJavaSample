package singleinheritance;

public class student extends citizen {
	private int sid;
	private string course;
	public student()
	{
		System.out.println("Student obj created");
		
	}
	public student(int cid,string name,int age,int sid,string course)
	{
		super(cid,name,sid);
		this.sid=sid;
		this.course=course;
		
		
	}
	public int 
	{
		
	}
	public void setSid(int sid) {
		this.sid=sid;
	}
	public string getCourse(String course) {
		this.course=course;
		
	}
	
	

}

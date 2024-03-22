package singleinheritance;

public class citizen {
	private int cid;
	private String name;
	private int age;
	public citizen()
	{
		System.out.print("citizen obj created");
		
	}
	public citizen (int cid ,String name,int age)
	{
		this.age=age;
		this.cid=cid;
		this.name=name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age=age;
	}

	

	public int getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	@Override
	public String toString() {
		return "Citizen [name=" + name + ", aadharNo=" + aadharNo + ", address=" + address + ", phno=" + phno + "]";
	}

}

	

package statickeyword;

public class smethod {
	int id=111;
	static int rollNo=234;
	static {
		System.out.println("static block----");
		System.out.println("rollNo.:"+rollNo);
		
	}
	//delault constructor
	public Staticmethod() {
		System.out.println("ID:"+id); 
		System.out.println("rollNo"+rollNo);
	}

}

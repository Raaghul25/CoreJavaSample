package Day1_JavaBasics;
import java.util.*;
public class SampleJava {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter the values of a and b");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println("Addition of "+a+" and "+b+" is "+c);
		c=a-b;
		System.out.println("Difference between "+a+" and "+b+" is "+c);
		c=a*b;
		System.out.println("Product of "+a+" and "+b+" is "+c);
		c=a/b;
		System.out.println("Quotient of "+a+" and "+b+" is "+c);
	}
}
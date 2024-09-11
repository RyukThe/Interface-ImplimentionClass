package Interface_ImplementationClass;
//implementation class 
public class Sample2 implements Sample1
{
	public void add()
	{
		System.out.println("The addition of a & b is:- " + (a+b));
		System.out.println(".........................................");
	}
	public void sub()
	{
		System.out.println("Then substraction of a & b is:- " +(a-b));
	}
}
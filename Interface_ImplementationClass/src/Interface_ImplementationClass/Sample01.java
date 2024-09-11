package Interface_ImplementationClass;

public class Sample01 implements Demo01,Demo02
{
	public void add()
	{
		System.out.println(a+b);
		System.out.println("......................");
	}
	public void sub()
	{
		System.out.println(a-b);
		System.out.println("......................");
	}
	public void mul()
	{
		System.out.println(a*b);
		System.out.println("......................");
	}
	public void div()
	{
		System.out.println(a/b);
	}
}

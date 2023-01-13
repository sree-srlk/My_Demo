package inheritance;

public class Sample2 extends Sample
{
	public void print1()
	{
		System.out.println("Child Class");
	}

	public static void main(String[] args)
	{
	  Sample2 ob=new Sample2();
	  ob.print();
	  ob.print1();

	}

}

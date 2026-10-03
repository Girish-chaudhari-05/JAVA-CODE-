class P
{
	void show()
	{
	  System.out.println("Parent class");
	  }
}
class c extends p
{
	void show()
	{
		System.out.println("child class");
	}
}
public class OAPP
{
	public static void main(String args[])
	{
		c c1=new c1();
		c1.show();
	}
}
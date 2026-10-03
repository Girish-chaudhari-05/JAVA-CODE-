//using the interface
interface Test
{
	int a=10;
	void display();
}
	class Testcase implements Test{
		   public void display()
		   {
			  System.out.println("In the interface"); 
		   }
	}
	

 class Interfacedemo
{
	public static void main(String args[])
	{
		Testcase n=new Testcase();
		n.display();
		System.out.println(n);
	}
}

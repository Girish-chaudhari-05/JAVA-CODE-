import java.util.*;
class cube
{
	int no;
	Scanner sc=new Scanner(System.in);
	void setValue()
	{
		System.out.println("Enter the input ");
		no=sc.nextInt();
	}
	int getValue()
	{
		return no*no*no;
	}
	
}
public class CubeApp{
	public static void main(String args[])
	{
		cube c=new cube();
		c.setValue();
		int r=c.getValue();
		System.out.println("Cube is"+r);
	}
}
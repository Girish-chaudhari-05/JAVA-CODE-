//pojo concept
import java.util.*;
class Emp{
	private int id;
	private String name;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setid(int id)
	{
		this.id=id;
	}
	public int getid()
	{
		return id;
		
	}
}
public class POJOAPP{
	public static void main(String args[])
	{
		Emp e=new Emp();
		e.setid(1);
		e.setName("Girish");
		String ename=e.getName();
		int eid=e.getid();
		System.out.println("Name is :-"+ename);
		System.out.println("ID is :-"+eid);

	}
}
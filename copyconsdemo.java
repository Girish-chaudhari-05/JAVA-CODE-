//using the copy constructor 

class copyconsdemo
{
	String name;
	int id;
	
	copyconsdemo(String name,int id)
	{
		this.name=name;
		this.id=id;
		
	}
	
	copyconsdemo(copyconsdemo copy1)
	{
		this.name=copy1.name;
		this.id=copy1.id;
	}
	@Override
	public  String toString(){
		return "Name="+name+ "ID"+name;
	}
	public static void main(String args[])
	{
		copyconsdemo cd=new copyconsdemo("girish",10);
		System.out.println("original "+cd);
		System.out.println("--------------------------------------");
		copyconsdemo cd2=new copyconsdemo(cd);
		System.out.println("copy  "+cd2);
	}
}
// using the constructor simple program 
class consdemo
{
	String name;
	int id;
	consdemo(String name,int id){
		this.name=name;
		this.id=id;

	}
	void display(){
		System.out.println("name:"+name);
		System.out.println("Id is :"+id);
	}

public static void main(String args[])
{
	consdemo d=new consdemo("Girish",10);
	d.display();
}}
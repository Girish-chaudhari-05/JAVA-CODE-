// using the abstraction

abstract class TV{
	abstract void turnOn();
	abstract void turnOff();
	
}
class TVRemote extends TV{
	 void turnOn(){
		System.out.println("Tv is turn onn");
	}
	
	void turnOff(){
		System.out.println("TV is turn off");
	}
}
public class Abstractdemo{
	public static void main(String args[])
	{
		TVRemote r=new TVRemote();
		r.turnOff();
		r.turnOn();
	}
}

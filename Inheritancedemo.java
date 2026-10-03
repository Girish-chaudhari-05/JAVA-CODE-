// using the inheritance simple program  
class Animal
{
	void sound(){
		System.out.println("Animal make a sound ");
	}
}

class dog extends Animal{
	void sound(){
		System.out.println("Dog is barking ");
	}
}
class cat extends Animal{
	void sound(){
		System.out.println("Cat sound is crazy ");
	}
}
public class Inheritancedemo{
	public static void main(String args[])
	{
		Animal a;
		a=new dog();
		a.sound();
		
		a=new cat();
		a.sound();
		
		
	}
}
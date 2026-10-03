// using the polymorphism 

class A{
	void m1(){
	System.out.println("This the first form of the layer ");
	}
}
class B extends A
{
	void m1(){
	System.out.println("This is the second layer ");
	}
}
class C extends A
{
	void m1(){
	System.out.println("This is the 3rd layer of polymorphism");
}
}
class polydemo{
	public static void main(String args[])
	{
		A ref;
		
		ref =new A();
		ref.m1();
		
		ref=new B();
		ref.m1();
				
		ref=new C();		
		ref.m1();
	}
}
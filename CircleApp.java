class circle
{
	float radius ,area,PI;
	circle(){
		PI=3.14f;
	}
	void setRadius(float radius)
	{
		this.radius=radius;
	}
	float getArea(){
		return radius*radius*PI;
	}
}
public class CircleApp
{
	public static void main(String args[])
	{
		circle c=new circle();
		c.setRadius(3.0f);
		float result=c.getArea();
		System.out.println("Area of circle "+result);
	}
}
import java.util.*;
class Product{
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	private String name;
	private int price;
	
	public Product() {
		
	}
	public Product(int id,String name,int price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}
}
public class Linkedlistdemo {
	public static void main(String[] args) {
			LinkedList<Product> lst = new LinkedList();
			 Product p1 = new Product(1,"ABC",100);
			 Product p2 = new Product(2,"XYZ",200);
			 Product p3 = new Product(3,"STV",300);
			 lst.add(p1);
			 lst.add(p2);
			 lst.add(p3);
			 Iterator <Product>i = lst.iterator();
			 while(i.hasNext()) {
				 Object object=i.next();
				 Product p=(Product)object;
				 System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getPrice());
			 }
	}
}

import java.util.*;
class ArrayList{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer>list=new ArrayList<>();
		System.out.println("Enter the number of element ");
		int a=sc.nextInt();
		System.out.println("Enter the Array Element ");
		for(int i=0;i<a;i++){
			list.add(sc.nextInt());
		}
		
	}
}
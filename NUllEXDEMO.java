import java.util.*;
public class NULLEXDEMO{
	static int arr[];
	public static void main(String args[])
	{
		arr=new int[5];
		 try{
			 arr[0]=1000;
			 System.out.println(arr[0]);
		 }
		 catch(NullPointerException e){
			 System.out.println("Error is "+e.getMessage());
			
	}
	}
}
/* Question 6: Write a java program to search an element in an array , its element found or not.
Asked In Practice assignment
Input:
Array = {10, 20, 30, 40, 50}
Element to search = 30
Output : Element 30 found at index 2
Explanation :
We traverse the array and compare each element with the search key. If it matches, print "found" with index; otherwise print "not found". */

import java.util.*;
class indexdemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array element");
		int n=sc.nextInt();
		
		int a[]=new int [n];
		
		System.out.println("Enter the array element ");
	    for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter element to search ");
		int key=sc.nextInt();
		boolean found =false;
		
		for(int i=0;i<n;i++)
		{
			if(a[i]==key)
			{
				System.out.print("Element"+key+"found at index "+i);
				break;
			}
		}
		if(found==false)
		{
			System.out.println("Element not found ");
			
		}
		sc.close();
	}
}
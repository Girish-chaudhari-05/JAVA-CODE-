/* Question 1: Write a Java program to input an array & display it.
Asked In Practice assignment
Input:
Array Size = 5
Array Elements = 10 20 30 40 50
Output:
*/
class Arraydemo
{
	public static void main(String args[])
	{
		int arr[]={10,20,30,40,50};
		System.out.println("Array element:");
		for(int i=0;i<arr.length;i++)
		{
		System.out.println(arr[i]);
		}
		System.out.println("ENter the size of array");
		System.out.println(arr.length);
}
}
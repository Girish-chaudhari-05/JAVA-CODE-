/* Write a Java program to calculate the sum of all elements in an array.
Asked In Practice assignment
Input:
Array Size = 5
Array Elements = 2 4 6 8 10
Output:
Sum of array elements = 30
Explanation:
? Initialize a variable sum = 0.
? Traverse the array and keep adding each element to sum.
? After the loop ends, sum will hold the total of all array elements. */
import java.util.*;

class CalArraydemo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        int sum = 0;

        System.out.println("Enter the array elements:");

        for(int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < size; i++)
        {
            sum = sum + arr[i];
        }

        System.out.println("Sum of array elements = " + sum);
    }
}
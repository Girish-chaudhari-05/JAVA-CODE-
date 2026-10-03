/* Question 7: Write a java program to display the reverse array.
Asked In Practice assignment
Input : Array = {1, 2, 3, 4, 5}
Output : Reverse array = {5, 4, 3, 2, 1}
Explanation :
The last element becomes the first, and the first becomes the last by traversing from the end to the start. */
import java.util.*;

class revdemo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int a[] = new int[n];

       
        System.out.println("Enter the array elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }

     
        System.out.print("Reverse array = ");

        for(int i = n - 1; i >= 0; i--)
        {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }
}
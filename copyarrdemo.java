/* Question 9: Write a java program to copy one array to another array.
Asked In Practice assignment
Input : Array1 = {5, 10, 15, 20}
Output : Array2 = {5, 10, 15, 20}
Explanation:
Copy each element of Array1 into Array2 using index-by-index assignment */


import java.util.*;

class copyarrdemo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int arr1[] = new int[n];
        int arr2[] = new int[n];

        System.out.println("Enter array elements:");

        for(int i = 0; i < n; i++)
        {
            arr1[i] = sc.nextInt();
        }

        // Copy elements 
        for(int i = 0; i < n; i++)
        {
            arr2[i] = arr1[i];
        }

        System.out.print("Array1 = {");
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr1[i]);
            if(i < n - 1)
                System.out.print(", ");
        }
        System.out.println("}");

        System.out.print("Array2 = {");
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr2[i]);
            if(i < n - 1)
                System.out.print(", ");
        }
        System.out.println("}");
    }
}
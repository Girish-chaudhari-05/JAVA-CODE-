/* Question 8: Write a java program to find missing elements in an array.
Asked In Practice assignment
Input : Array = {1, 2, 4, 5, 7} (numbers from 1 to 7 should be present)
Output : Missing elements = {3, 6}
Explanation:
Check sequence numbers one by one. If a number from 1 to maximum (7) is not in the array, it is missing */
import java.util.*;

class elemissdemo
{
    public static void main(String args[])
    {
        int arr[] = {1, 2, 4, 5, 7};

        int max = arr[arr.length - 1];

        System.out.print("Missing elements = ");

        for(int i = 1; i <= max; i++)
        {
            boolean found = false;

            for(int j = 0; j < arr.length; j++)
            {
                if(arr[j] == i)
                {
                    found = true;
                    break;
                }
            }

            if(found == false)
            {
                System.out.print(i + " ");
            }
        }
    }
}
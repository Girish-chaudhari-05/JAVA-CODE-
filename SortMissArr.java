/* Question 39: Write a program in java to find the smallest missing element from a sorted array?
Asked In Practice assignment
Input:
Array = [0, 1, 3, 4, 5, 6, 7, 9]

Output:
Smallest Missing Element = 2

Explanation:
Traverse the array and compare each element with its expected index value; the first mismatch indicates the missing number. */

public class SortMissArr {
    public static void main(String[] args) {
        int[] array = {0, 1,3, 4, 5, 6, 7, 9};
        int smallestMissing = findSmallestMissing(array);
        System.out.println("Smallest Missing Element = " + smallestMissing);
    }

    public static int findSmallestMissing(int[] array) {
        for (int i = 0; i < array.length; i++) {
           
            if (array[i] != i) {
                return i; 
            }
        }
        
        return array.length;
    }
}
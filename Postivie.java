/*Q34. Write a Java program to check whether a number is positive, negative, or zero.
 Input : Number = -8
 Output : Negative
 Explanation : If the number is less than zero, it is negative.

*/


import java.util.*;

class Postivie
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int a = sc.nextInt();

        String result = (a > 0) ? "Positive" : (a < 0) ? "Negative" : "Zero";

        System.out.println(result);
    }
}

/* Q50. Write a Java program to check whether a number is a perfect square using ternary operator.
 Input : Number = 49
 Output : Perfect Square
 Explanation : 7 × 7 = 49. */
 
 import java.util.*;

class Sq
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();

        int root = (int)Math.sqrt(a);

        String result = (root * root == a) ? "Perfect Square" : "Not Perfect Square";

        System.out.println(result);
    }
}

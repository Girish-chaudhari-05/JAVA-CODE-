/* Q54. Write a Java program to print the larger digit between first and last digit of a three-digit number.
 Input : Number = 582
 Output : Larger Digit = 5
 Explanation : First digit 5 is greater than last digit 2. */
 
 import java.util.*;

class Large
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three digit number");
        int num = sc.nextInt();

        int first = num / 100;
        int last = num % 10;

        int larger = (first > last) ? first : last;

        System.out.println("Larger Digit = " + larger);
    }
}

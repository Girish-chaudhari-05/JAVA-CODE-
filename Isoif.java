/* Q3. Write a Java program to check whether a triangle is equilateral , isoscale  or scalene.
 */
 import java.util.*;

class Isoif
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers:");
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a == b && b == c)
        {
            System.out.println("Equilateral");
        }
        else if(a == b || b == c || a == c)
        {
            System.out.println("Isosceles");
        }
        else
        {
            System.out.println("Scalene");
        }
    }
}

/* 6. Write a Java program to check whether a character is alphabetic or not.
 */
import java.util.*;

class Alphaif
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        
        char a = sc.next().charAt(0);

        if((a >= 'A' && a <= 'Z') || (a >= 'a' && a <= 'z'))
        {
            System.out.println("Alphabet");
        }
        else
        {
            System.out.println("Not Alphabet");
        }
    }
}

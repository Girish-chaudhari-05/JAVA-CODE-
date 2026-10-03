/* Question 2: Write a Java program to implement a Number Checker.
Create a class NumberCheck with a variable number.
Check whether the number is Even or Odd using a class object.
Asked In Practice assignment
Input:
Enter Number : 45

Output:
Number : 45
Result : Odd Number
 */
 
 import java.util.*;

class classNoCheck
{
    int no;

    public String checkEvenNo()
    {
        if(no % 2 == 0)
        {
            return "Even Number";
        }
        else
        {
            return "Odd Number";
        }
    }
}

public class classNoCheckEven
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        classNoCheck d = new classNoCheck();

        System.out.print("Enter the number: ");
        d.no = sc.nextInt();

        System.out.println("Number: " + d.no);
        System.out.println("Result: " + d.checkEvenNo());

        sc.close();
    }
}
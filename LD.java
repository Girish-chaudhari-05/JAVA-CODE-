/* Q55. Write a java program to check whether the middle digit is greater than the sum of first and last digits.
 Input : Number = 853
 Output : Not Greater
 Explanation : Middle digit 5 < (8 + 3).
 */
 
 import java.util.*;

class LD
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three digit number");
        int num = sc.nextInt();

        int first = num / 100;
        int middle = (num / 10) % 10;
        int last = num % 10;

        String result = (middle > (first + last)) ?
                        "Greater" : "Not Greater";

        System.out.println(result);
    }
}

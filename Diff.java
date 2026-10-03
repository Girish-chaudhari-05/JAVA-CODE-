/* Q51. Write a Java program to check whether the absolute difference between two numbers is greater than 10.
 Input:
 m = 25
 n = 12
 Output : Difference is greater than 10
Explanation: |25 − 12| = 13.
 */

import java.util.*;

class Diff
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m and n");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int diff = Math.abs(m - n);

        String result = (diff > 10) ? "Difference is greater than 10" :"Difference is not greater than 10";

        System.out.println(result);
    }
}

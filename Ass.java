/* Q56. Write a Java expression using arithmetic and assignment operators to calculate net salary.
 Input:
 Basic Salary = 35000
 Tax Rate = 12%
 Output : Net Salary = 30800
 Explanation : Tax is deducted from basic salary.
 */
 /* 
 import java.util.*;

class Ass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Basic Salary");
        double basic = sc.nextDouble();

        double taxRate = 0.12;

        basic -= basic * taxRate;  

        System.out.println("Net Salary = " + basic);
    }
}
 */
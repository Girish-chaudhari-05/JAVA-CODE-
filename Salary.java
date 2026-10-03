/* Q44. Write a Java program to calculate gross salary based on basic salary conditions.
 Input : Basic Salary = 18000
 Output : Gross Salary = 34650
 Explanation : HRA and DA percentages are applied based on salary slab.
 */
 import java.util.*;

class Salary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Basic Salary:");
        int basic = sc.nextInt();

        double hra = (basic <= 10000) ? basic * 0.20 :
                     (basic <= 20000) ? basic * 0.25 :
                                        basic * 0.30;

        double da = (basic <= 10000) ? basic * 0.80 :
                    (basic <= 20000) ? basic * 0.90 :
                                       basic * 0.95;

        double gross = basic + hra + da;

        System.out.println("Gross Salary = " + gross);
    }
}

/*Q2.  Write a java program to print this pattern. 
 
     1 
    2  2 
   3    3 
  4      4 
 5        5 
  4      4 
   3    3 
    2  2 
     1

*/

import java.util.Scanner;
class PatternDemo {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

           
            System.out.print(i);

            for (int j = 1; j <= 2 * i - 3; j++) {
                System.out.print(" ");
            }

            if (i > 1) {
                System.out.print(i);
            }

           
            System.out.print("\n");
        }

        for (int i = n - 1; i >= 1; i--) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            System.out.print(i);

            for (int j = 1; j <= 2 * i - 3; j++) {
                System.out.print(" ");
            }

            if (i > 1) {
                System.out.print(i);
            }

           
            System.out.print("\n");
        }
    }
}

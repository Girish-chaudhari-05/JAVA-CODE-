/*
Q30. Write a Java program to check whether a number is a multiple of both 3 and 5.
Input	:  15
Output  :  Multiple of both 3 and 5
Explanation :	Logical AND operator is used.

*/

import java.util.*;

class Multiple {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        
        int a = sc.nextInt();
        
        if (a % 3 == 0 && a % 5 == 0) {
            System.out.println("Multiple of both 3 and 5");
        } else {
            System.out.println("Not a multiple of both 3 and 5");
        }
    }
}
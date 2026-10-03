/*
Q1. Write a java program to check number is Armstrong number or Armstrong number using function 
recursion. 
*/

import java.util.Scanner;

class Armdemo {

     
    static int armstrong(int n) {

        
        if (n == 0) {
            return 0;
        }

        int digit = n % 10;

        
        return (digit * digit * digit) + armstrong(n / 10);
    }

    public static void main(String args[]) {

        
        Scanner sc = new Scanner(System.in);
      
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

       
        int result = armstrong(n);

        if (result == n) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }
}

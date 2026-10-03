/*
Q8. Given an ArrayList<String>, reverse every individual string using only while loops. Do not use 
StringBuilder.reverse() or any built-in reverse method. 
Explanation: 
Traverse the ArrayList using one while loop. For each string, start from its last character and move 
toward the first character using another while loop. 
*/

import java.util.ArrayList;
import java.util.Scanner;

class Revdemo {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<String>();
    
        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();

        sc.nextLine();

        int i = 0;

        while (i < n) {

            System.out.print("Enter string " + (i + 1) + ": ");
            String str = sc.nextLine();

            list.add(str);

            i++;
        }

        System.out.println("Reversed Strings:");

       
        i = 0;

        while (i < list.size()) {

            String str = list.get(i);

            int j = str.length() - 1;

            while (j >= 0) {

                System.out.print(str.charAt(j));

                j--;
            }

            System.out.print(" ");

            i++;
        }
    }
}

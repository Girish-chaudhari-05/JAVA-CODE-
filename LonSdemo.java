import java.util.ArrayList;
import java.util.Scanner;

class LonSdemo {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<String>();

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();

        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter string " + (i + 1) + ": ");
            String str = sc.nextLine();

            list.add(str);
        }

        int maxLength = list.get(0).length();
        int minLength = list.get(0).length();

        for (int i = 1; i < list.size(); i++) {

            int length = list.get(i).length();

            if (length > maxLength) {
                maxLength = length;
            }

            if (length < minLength) {
                minLength = length;
            }
        }

      
        System.out.println("Longest String:");

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).length() == maxLength) {
                System.out.println(list.get(i));
            }
        }

        System.out.println("Shortest Strings:");

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).length() == minLength) {
                System.out.println(list.get(i));
            }
        }
    }
}

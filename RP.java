import java.util.Scanner;

class RP {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int original = num;
        int reverse = 0;

        while (num > 0) {

            int digit = num % 10;

            reverse = reverse * 10 + digit;

            num = num / 10;
        }

        System.out.println("Reverse = " + reverse);

        if (original == reverse) {

            System.out.println("Palindrome");

            if (original % 3 == 0 && original % 5 == 0)
                System.out.println("Divisible by both 3 and 5");
            else
                System.out.println("Not divisible by both 3 and 5");

        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
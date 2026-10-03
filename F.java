import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int original = num;
        int temp = num;
        int total = 0;

        while (temp > 0) {

            int digit = temp % 10;

            int factorial = 1;

            for (int i = 1; i <= digit; i++) {
                factorial = factorial * i;
            }

            System.out.println("Factorial of " + digit + " = " + factorial);

            total += factorial;

            temp = temp / 10;
        }

        System.out.println("Total sum = " + total);

        if (total == original)
            System.out.println("Strong Number");
        else
            System.out.println("Not a Strong Number");
    }
}
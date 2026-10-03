import java.util.Scanner;

class M {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();

        int positive = 0, negative = 0, zero = 0;
        int largestPositive = Integer.MIN_VALUE;
        int smallestNegative = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {

            System.out.print("Enter number: ");
            int num = sc.nextInt();

            if (num > 0) {
                positive++;

                if (num > largestPositive)
                    largestPositive = num;

            } else if (num < 0) {
                negative++;

                if (num < smallestNegative)
                    smallestNegative = num;

            } else {
                zero++;
            }
        }

        System.out.println("Positive numbers = " + positive);
        System.out.println("Negative numbers = " + negative);
        System.out.println("Zero = " + zero);

        if (positive > 0)
            System.out.println("Largest positive = " + largestPositive);
        else
            System.out.println("No positive number");

        if (negative > 0)
            System.out.println("Smallest negative = " + smallestNegative);
        else
            System.out.println("No negative number");
    }
}
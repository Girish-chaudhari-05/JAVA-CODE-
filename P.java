import java.util.Scanner;

class P {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start: ");
        int start = sc.nextInt();

        System.out.print("Enter end: ");
        int end = sc.nextInt();

        int count = 0;
        int sum = 0;

        System.out.println("Prime numbers:");

        for (int num = start; num <= end; num++) {

            if (num < 2)
                continue;

            boolean prime = true;

            for (int i = 2; i < num; i++) {

                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.print(num + " ");
                count++;
                sum += num;
            }
        }

        System.out.println();
        System.out.println("Total primes = " + count);
        System.out.println("Sum of primes = " + sum);
    }
}
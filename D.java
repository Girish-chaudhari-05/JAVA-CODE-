import java.util.Scanner;

class D{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start: ");
        int start = sc.nextInt();

        System.out.print("Enter end: ");
        int end = sc.nextInt();

        int count = 0;
        int sum = 0;

        System.out.println("Numbers:");

        for (int num = start; num <= end; num++) {

            if (num % 3 == 0 && num % 5 != 0) {

                System.out.print(num + " ");

                count++;
                sum += num;
            }
        }

        System.out.println();
        System.out.println("Count = " + count);
        System.out.println("Sum = " + sum);
    }
}


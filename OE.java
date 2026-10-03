import java.util.Scanner;

class OE {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int temp = Math.abs(num);

        int largest = 0;
        int smallest = 9;
        int sum = 0;
        int evenCount = 0;
        int oddCount = 0;

        while (temp > 0) {

            int digit = temp % 10;

            if (digit > largest)
                largest = digit;

            if (digit < smallest)
                smallest = digit;

            sum += digit;

            if (digit % 2 == 0)
                evenCount++;
            else
                oddCount++;

            temp = temp / 10;
        }

        System.out.println("Largest digit = " + largest);
        System.out.println("Smallest digit = " + smallest);
        System.out.println("Sum of digits = " + sum);
        System.out.println("Even digits = " + evenCount);
        System.out.println("Odd digits = " + oddCount);
    }
}
import java.util.Scanner;

class DS {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        while (num >= 10) {

            int sum = 0;

            while (num > 0) {
                int digit = num % 10;
                sum += digit;
                num = num / 10;
            }

            num = sum;
        }

        System.out.println("Final single digit = " + num);

        if (num % 2 == 0)
            System.out.println("Final digit is Even");
        else
            System.out.println("Final digit is Odd");
    }
}
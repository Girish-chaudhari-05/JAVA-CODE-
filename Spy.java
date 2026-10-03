import java.util.Scanner;

public class Spy {

    public static void main(String x[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();

        int b = a / 1000;          // thousand
        int c = (a / 100) % 10;    // hundred
        int d = (a / 10) % 10;     // tens
        int e = a % 10;            // ones

        int sum = b + c + d + e;
        int product = b * c * d * e;

        if (sum == product) {
            System.out.println("Spy number");
        } else {
            System.out.println("Not a spy");
        }
    }
}
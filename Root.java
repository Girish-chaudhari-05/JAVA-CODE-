import java.util.Scanner;

public class Root {

    public static void main(String x[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number");
        double a = sc.nextDouble();

        System.out.println("Enter 2nd number");
        double b = sc.nextDouble();

        System.out.println("Enter a 3rd number");
        double c = sc.nextDouble();

        double d = (b*b) - 4*a*c;

        if (d > 0) {

            double f = (-b + Math.sqrt(d)) / (2 * a);
            double g = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("Two distinct roots");
            System.out.println("Root 1 = " + f);
            System.out.println("Root 2 = " + g);

        } else if (d == 0) {

            double r = (-b) / (2 * a);

            System.out.println("Equal roots:");
            System.out.println("Root = " + r);

        } else {
            System.out.println("Roots are imaginary");
        }
    }
}
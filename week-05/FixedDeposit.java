import java.util.Scanner;

public class FixedDeposit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char check = 'y';

        while (check == 'y') {

            System.out.println("Enter your Principal amount, Time (years), and Rate:");

            double P = input.nextDouble();
            double T = input.nextDouble();
            double R = input.nextDouble();

            if (P >= 1000 && T >= 0 && T <= 5 && R >= 8 && R <= 12) {

                System.out.println("Principal: " + P);
                System.out.println("Annual Rate: " + R);
                System.out.println("Monthly Rate: " + (R / 12));
                System.out.println("Time in Years: " + T);
                System.out.println("Time in Months: " + (T * 12));

                // Correct compound interest formula
                double A = P * Math.pow(1 + (R / (12 * 100)), 12 * T);

                System.out.println("Maturity Amount (before fees): " + A);

                double F = A * 0.005;
                System.out.println("Fee Rate: 0.5%");
                System.out.println("Fee Amount: " + F);
                System.out.println("Final Amount: " + (A - F));

            } else {
                System.out.println("Invalid input. Please follow the constraints.");
            }

            System.out.println("Continue? (y/n): ");
            check = input.next().toLowerCase().charAt(0);
        }

        input.close();
    }
}

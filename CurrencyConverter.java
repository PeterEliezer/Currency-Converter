import java.util.Scanner;

public class CurrencyConverter {
    private static final double RATE = 1500.0; 

    
    public static double usdToFrw(double usd) {
        return usd * RATE;
    }

    public static double frwToUsd(double frw) {
        return frw / RATE;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        System.out.print("Convert (1 = USD→FRW, 2 = FRW→USD): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Result: " + usdToFrw(amount) + " FRW");
        } else if (choice == 2) {
            System.out.println("Result: " + frwToUsd(amount) + " USD");
        } else {
            System.out.println("Invalid choice.");
        }

3        sc.close();
    }
}

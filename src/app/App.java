package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double money = scanner.nextDouble();

        System.out.print("Enter number of months: ");
        int month = scanner.nextInt();

        System.out.print("Enter annual interest rate in percentage: ");
        double interset_rate = scanner.nextDouble();
        interset_rate        = interset_rate/100;

        double total_interset = money;
        for (int i = 0; i < month; i++) {
            total_interset += total_interset*interset_rate;
        }
        System.out.println("Total of interset: " + total_interset);
    }
}

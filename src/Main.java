import java.util.Scanner;

import Entities.Company;
import Entities.Individual;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers of tax prayers: ");
        int taxPrayers = sc.nextInt();
        String[] names = new String[taxPrayers];
        double[] taxes = new double[taxPrayers];
        double sumTaxes = 0.0;
        
        for (int i = 0; i < taxPrayers; i++) {
            System.out.print("Individual or company (I/C): ");
            String person = sc.next();
            if (person.equalsIgnoreCase("I")) {
                Individual ind = new Individual(sc);
                double taxe = ind.taxesIndividual();
                names[i] = ind.getName();
                taxes[i] = taxe;
                sumTaxes += taxe;
            } else if (person.equalsIgnoreCase("C")) {
                Company comp = new Company(sc);
                double taxe = comp.taxesCompany();
                names[i] = comp.getName();
                taxes[i] = taxe;
                sumTaxes += taxe;
            } else {
                System.out.println("Invalid option. Enter only I or C.");
                i--;
            }
        }
        
        sc.close();
        
        System.out.println("\nTaxes Paid: ");
        for (int i = 0; i<taxPrayers; i++) {
            System.out.printf("%s: $%.2f%n", names[i], taxes[i]);
        }
        
        System.out.printf("\nTOTAL TAXES: $ %.2f", sumTaxes);
    }
}
package Entities;
import java.util.Scanner;

public class Individual extends Person{
    private double healthExpenditures;

    public Individual(Scanner scanner) {
        setName(scanner);
        setAnualIncome(scanner);
        
        while (true) {
            System.out.print("Health Expenditures: ");
            double input = scanner.nextDouble();
            if (input >= 0 && input <= getAnualIncome()) {
                this.healthExpenditures = input;
                break;
            } else {
                System.out.println("Invalid Health Expenditures, must be >=0 or <=Annual Income");
            }
        }
    }
  
    public Double taxesIndividual() {
        double taxe;
        double income = super.getAnualIncome();
        if (income<20000) {
            taxe = (income * 0.15) - (this.healthExpenditures * 0.50);
        } else {
            taxe = (income * 0.25) - (this.healthExpenditures * 0.50);
        }
        return taxe;

    }
}
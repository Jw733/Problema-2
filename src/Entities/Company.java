package Entities;
import java.util.Scanner;

public class Company extends Person {
    private int numberOfEmployers;
    
    public Company(Scanner scanner) {
        setName(scanner);
        setAnualIncome(scanner);
        
        while (true) {
        System.out.print("Number of employees: ");
        int input = scanner.nextInt();
        if (input >= 0) {
            this.numberOfEmployers = input;
            break;
        } else {
            System.out.println("Invalid employees, must be >=0");
        }
        }
    }

    public double taxesCompany() {
        double taxe;
        double income = super.getAnualIncome();
        if (numberOfEmployers>10) {
            taxe = income * 0.14;
        } else {
            taxe = income * 0.16;
        }
        return taxe;
    }
}
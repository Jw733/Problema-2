package Entities;
import java.util.Scanner;

public class Person {
    private String name;
    private double anualIncome;
  
    public void setName(Scanner scanner) {
        String input;
        do {
            System.out.print("Name: ");
            input = scanner.nextLine().trim();
            if (input.length() < 3) {
                System.out.println("Invalid name needs 3 or more characters");
            }
        }   while (input.length() < 3);

        this.name = input;
    }

    public String getName() {
        return this.name;
    }
    
    public void setAnualIncome(Scanner scanner) {
        while (true) {
        System.out.print("Anual Income: ");
        double input = scanner.nextDouble();
        if (input < 0){
            System.out.println(" Invalid Annual Income, must be >=0");
        } else {
            this.anualIncome = input;
            break;
        }   
        } 
    }
        
    public double getAnualIncome() {
        return this.anualIncome;
    }
}
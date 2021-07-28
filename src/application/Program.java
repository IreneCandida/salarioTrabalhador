package application;

import java.util.Date;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter department's name: ");
		String departamentName = sc.nextLine();
		
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Level: ");
		int level = sc.nextInt();
		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();
		System.out.println("How namy contracts to this worker? ");
		int numContracts = sc.nextInt();
		Date date;
		double valuePorHour;
		
		for (int i = 0; i < numContracts; i++) {
			System.out.printf("Enter contract %d data", i);
			System.out.println("Date (DD/MM/YYYY");
			date = sc.next();
			System.out.println("Value per hour: ");
			valuePorHour = sc.nextDouble();
			double hoursDuration;
			System.out.println("Duration (hours): ");
			hoursDuration = sc.nextDouble();
		}
		
		System.out.println("Enter month and year to clculate income (MM/YYYY): ");
		
		
		sc.close();

	}

}

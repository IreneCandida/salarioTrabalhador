package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entitiesEnum.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		System.out.print("Enter department's name: ");
		String departamentName = sc.nextLine();
		System.out.print("Enter worker data:");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(workerName,WorkerLevel.valueOf(workerLevel), baseSalary, new Departament (departamentName));
		System.out.println("How namy contracts to this worker? ");
		int numContract = sc.nextInt();
				
		for (int i = 1; i <= numContract; i++) {
			System.out.printf("Enter contract # " + i + " data: ");
			System.out.println("Date (DD/MM/YYYY");
			Date contractDate = sdf.parse(sc.next());
			System.out.println("Value per hour: ");
			double valuePorHour = sc.nextDouble();
			System.out.println("Duration (hours): ");
			int hoursDuration = sc.nextInt();
			
			HourContract contract = new HourContract(contractDate, valuePorHour, hoursDuration);
			worker.addContract(contract);
		}
		System.out.println();
		System.out.println("Enter month and year to clculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Departament: " + worker.getDepartament().getName());
		System.out.println("Icome for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		
		sc.close();

	}

}

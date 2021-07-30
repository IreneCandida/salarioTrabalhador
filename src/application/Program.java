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
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		//le os dados do trabalhador
		System.out.print("Enter department's name: ");
		String departamentName = sc.nextLine();
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();
		//instância a classe Worker
		Worker worker = new Worker(workerName,WorkerLevel.valueOf(workerLevel), baseSalary, new Departament (departamentName));
		
		// le os dados dos contratos do trabalhado
		System.out.println("How namy contracts to this worker? ");
		int numContract = sc.nextInt();
				
		for (int i = 1; i <= numContract; i++) {
			System.out.println("Enter contract # " + i + " data: ");
			System.out.print("Date (DD/MM/YYYY) ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hoursDuration = sc.nextInt();
			//instancia a classe HourContract
			HourContract contract = new HourContract(contractDate, valuePerHour, hoursDuration);
			//adiciona o contrato na lista de contratos do trabalhador
			worker.addContract(contract);
		}
		//imprime o valor do salario base + o valor dos contratos do mês do trabalhador
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

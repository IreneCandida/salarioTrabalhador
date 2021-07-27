package entities;

import entitiesEnum.WorkerLevel;

public class Worker {
	
	private String name;
	private double baseSalary;
	private WorkerLevel level;
		
	public Worker() {
		
	}

	public Worker(String name, double baseSalary, WorkerLevel level) {
		this.name = name;
		this.baseSalary = baseSalary;
		this.level = level;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}
	
	public void addContract(HourContract contract) {
		
	}
	
	public void removeContract(HourContract contract) {
		
	}
	
	public double income (Integer year, Integer month) {
		double a = 0.0;
		return a;
	}
	
	
	
	
	

}

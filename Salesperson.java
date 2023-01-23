package com.antra;

class Employee1 {
	String name;
	double baseSalary;

	Employee1(String name, double baseSalary) {
		this.name = name;
		this.baseSalary = baseSalary;
	}
}

public class Salesperson extends Employee1 {
	double commission;

	public Salesperson(String name, double baseSalary, double commission) {
		// insert code here
		super(name, baseSalary);
		this.commission = commission;
	}
}

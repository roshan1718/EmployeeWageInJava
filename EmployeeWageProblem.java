// Description : Employee Wage Problem
// Author : Roshan Balkrushna Shinde
// Since 28 March 2020 

import java.util.Scanner;
interface Camputation {
	void calculateWage();
}

public class EmployeeWageProblem implements Camputation{

	//CONSTANTS
	private static final int IS_FULL_TIME = 1, IS_PART_TIME = 2;
	private final int TOTAL_COMPANIES;

	//Variables
	private static int empRatePerHour = 0, numWorkingDays = 0;
	private static int maxHrsInMonth = 0;
	CompanyEmpWage employee[];

	public EmployeeWageProblem(int totalCompanies) {

		this.TOTAL_COMPANIES = totalCompanies;
		this.employee = new CompanyEmpWage [this.TOTAL_COMPANIES];
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Total companies");
		int totalCompany= sc.nextInt();
		EmployeeWageProblem company = new EmployeeWageProblem(totalCompany);
		for (int i = 0; i < company.employee.length; i++) {

			empRatePerHour = (int) (100 + Math.random() * 200);
			numWorkingDays = (int) (20 + Math.random() * 25);
			maxHrsInMonth = (int) (100 + Math.random() * 200);

			company.employee[i] = new CompanyEmpWage(empRatePerHour,numWorkingDays, maxHrsInMonth);
		}
		company.calculateWage();
	}

public void calculateWage() {

	for(int empNo = 0; empNo < employee.length; empNo++){
		int empHrs = 0, empWage = 0, totalEmpWage = 0;
		int totalWorkingDays = 0, totalEmpHrs = 0;
		//Computation
		while (totalEmpHrs <= employee[empNo].getMaxHrsInMonth() &&
				totalWorkingDays < employee[empNo].getNumWorkingDays()) {
			totalWorkingDays++;
			int empChoice = ((int) Math.floor(Math.random() * 10)) % 3;
			switch(empChoice) {
				case IS_FULL_TIME:
					empHrs = 8;
					break;
				case IS_PART_TIME:
					empHrs = 4;
					break;
				default:
					empHrs = 0;
			}
			totalEmpHrs += empHrs;
			empWage = empHrs * employee[empNo].getEmpRatePerHour();
			totalEmpWage += empWage;
		}
		employee[empNo].setTotalEmpWage(totalEmpWage);
		System.out.println("Monthly Salary of employee " + (empNo + 1) + ":" + totalEmpWage);
	}
}
}

class CompanyEmpWage{

	//CONSTANTS
	private final int EMP_RATE_PER_HOUR, NUM_WORKING_DAYS;
	private final int MAX_HOURS_IN_MONTH;

	//Variables
	private int totalEmpWage = 0;
	public CompanyEmpWage(int empRatePerHour,int numWorkingDays,int maxHrsInMonth) {

		this.EMP_RATE_PER_HOUR = empRatePerHour;
		this.NUM_WORKING_DAYS = numWorkingDays;
		this.MAX_HOURS_IN_MONTH = maxHrsInMonth;
	}

	public int getEmpRatePerHour() {
		return EMP_RATE_PER_HOUR;
	}

	public int getNumWorkingDays() {
		return NUM_WORKING_DAYS;
	}

	public int getMaxHrsInMonth() {
		return MAX_HOURS_IN_MONTH;
	}

	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}

}

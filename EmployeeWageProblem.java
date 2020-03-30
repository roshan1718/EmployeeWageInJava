// Description : Employee Wage Problem
// Author : Roshan Balkrushna Shinde
// Since 28 March 2020 
import java.util.*;
import java.util.Scanner;

interface Camputation {
	void calculateWage();
}

public class EmployeeWageProblem implements Camputation{

	//CONSTANTS
	private static final int IS_FULL_TIME = 1, IS_PART_TIME = 2;
	
	//Variables
	private static int empRatePerHour = 0, numWorkingDays = 0;
	private static int maxHrsInMonth = 0;
	ArrayList <CompanyEmpWage> employee = new ArrayList<CompanyEmpWage>();


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Total companies");
		int totalCompany= sc.nextInt();
		EmployeeWageProblem company = new EmployeeWageProblem();
		while (totalCompany != 0) {

			empRatePerHour = (int) (100 + Math.random() * 200);
			numWorkingDays = (int) (20 + Math.random() * 25);
			maxHrsInMonth = (int) (100 + Math.random() * 200);

			company.employee.add(new CompanyEmpWage(empRatePerHour,numWorkingDays, maxHrsInMonth));
			totalCompany--;
		}
		company.calculateWage();
	}

public void calculateWage() {
	int empNo= 1;
	for(CompanyEmpWage emp :employee){
		System.out.println("Daily wage of employee" + empNo);
		int empHrs = 0, empWage = 0, totalEmpWage = 0;
		int totalWorkingDays = 0, totalEmpHrs = 0;
		//Computation Logic
		while (totalEmpHrs <= emp.getMaxHrsInMonth() &&
				totalWorkingDays < emp.getNumWorkingDays()) {
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
			empWage = empHrs * emp.getEmpRatePerHour();
			totalEmpWage += empWage;
			System.out.println("Day"+ totalWorkingDays+ "::"+empWage);
		}
		emp.setTotalEmpWage(totalEmpWage);
		System.out.println("Monthly Salary of employee " + (empNo) + ":" + totalEmpWage);
		empNo++;
		}
	}
}

class CompanyEmpWage{

	//CONSTANTS
	private final int EMP_RATE_PER_HOUR, NUM_WORKING_DAYS;
	private final int MAX_HOURS_IN_MONTH;
	private ArrayList<Integer> dailyWages = new ArrayList <Integer>();
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
	
	public void addDailyWage(int wage){
		dailyWages.add(wage);
	}

}

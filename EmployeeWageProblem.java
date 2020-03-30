// Description : Employee Wage Problem
// Author : Roshan Balkrushna Shinde
// Since 28 March 2020 

import java.util.Scanner;
public class EmployeeWageProblem{
//CONSTANTS
public static final int IS_FULLTIME=1, IS_PARTTIME=2;
//variables
public static  int wagePerHour, numWorkingDays, maxHoursInMonth;
static int totalWage=0;

public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Total companies");
	int totalCompany= sc.nextInt();
	EmployeeWage company[] = new EmployeeWage[totalCompany];
	for (int i = 0; i < totalCompany; i++) {
		
		wagePerHour = (int) (100 + Math.random() * 300);

		numWorkingDays = (int) (20 + Math.random() * 25);

		maxHoursInMonth = (int) (100 + Math.random() * 200);
		
		company[i] = new EmployeeWage(wagePerHour, numWorkingDays,
											 maxHoursInMonth);
		wageCalculation(company[i], i);
	}
}

public static void wageCalculation(EmployeeWage company, int empNo) {
	int salary=0, totalEmpHours=0, totalWorkingDays=0 ,totalWage=0;
	while ( totalEmpHours <= company.getMaxHoursInMonth() && totalWorkingDays< company.getNumWorkingDays()){
		int checkNumber=(int)(Math.floor(Math.random()*10)%3);
		int empHours=0;
		totalWorkingDays+=1;
		switch (checkNumber){
				case IS_FULLTIME:
					//System.out.println("Employee Is Full Time..!");
					empHours=8;
					break;
				case IS_PARTTIME:
					//System.out.println("Employee Is Part Time..!");
					empHours=4;
					break;
				default:
					//System.out.println("Employee Is Absent..");
					empHours=0;
					break;
			}
			salary=empHours*company.getWagePerHour();
			totalEmpHours+=empHours;
			//System.out.println("Salary of Employee on "+noOfDays+ "th Day is.."+salary);
			totalWage+=salary;
		}
		company.setTotalWage(totalWage);
		System.out.println("ToTal Salary of Employee-" +(empNo + 1)+ " is::"+ totalWage);
	}

}


class EmployeeWage{
//CONSTANTS
public static  int WAGE_PER_HOURS, NUM_WORKING_DAYS, MAX_HOURS_IN_MONTH;

//Variables
static int totalWage=0;

   public EmployeeWage( int NUM_WORKING_DAYS, int WAGE_PER_HOURS, int MAX_HOURS_IN_MONTH ){

      //this.COMPANY = COMPANY;
      this.NUM_WORKING_DAYS = NUM_WORKING_DAYS;
      this.WAGE_PER_HOURS = WAGE_PER_HOURS;
      this.MAX_HOURS_IN_MONTH = MAX_HOURS_IN_MONTH;
   }

	public int getWagePerHour() {
	return WAGE_PER_HOURS;
	}

	public int getNumWorkingDays() {
	return NUM_WORKING_DAYS;
	}

	public int getMaxHoursInMonth() {
	return MAX_HOURS_IN_MONTH;
	}

	public void setTotalWage(int totalWage) {
		this.totalWage = totalWage;
	}
}


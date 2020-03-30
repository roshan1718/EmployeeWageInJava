// Description : Employee Wage Problem
// Author : Roshan Balkrushna Shinde
// Since 28 March 2020 

public class EmployeeWageProblem{
//CONSTANTS
public static final int IS_FULLTIME=1, IS_PARTTIME=2;
public static  int WAGE_PER_HOURS, NUM_WORKING_DAYS, MAX_HOURS_IN_MONTH;

//Variables
static int totalWage=0;

	public EmployeeWageProblem( int NUM_WORKING_DAYS, int WAGE_PER_HOURS, int MAX_HOURS_IN_MONTH ){
		//this.COMPANY = COMPANY;
		this.NUM_WORKING_DAYS = NUM_WORKING_DAYS;
		this.WAGE_PER_HOURS = WAGE_PER_HOURS;
		this.MAX_HOURS_IN_MONTH = MAX_HOURS_IN_MONTH;
	}

	public static void main(String args[]){

		EmployeeWageProblem company1 = new EmployeeWageProblem(20,20,100);
		System.out.println("Employee salary in company1");
		wageCalculation(company1);
		EmployeeWageProblem company2 = new EmployeeWageProblem(25,30,90);
		System.out.println("Employee salary in company2");
		wageCalculation(company2);

	}

private void setTotalWage(int totalWage){
	this.totalWage= totalWage;
}

public static void wageCalculation(EmployeeWageProblem company) {
	int salary=0, totalEmpHours=0, noOfDays=0 ,totalWage=0;
	while ( totalEmpHours <=company.MAX_HOURS_IN_MONTH && noOfDays < company.NUM_WORKING_DAYS ){
		int checkNumber=(int)(Math.floor(Math.random()*10)%3);
		int empHours=0;
		noOfDays+=1;
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
			salary=empHours*WAGE_PER_HOURS;
			totalEmpHours+=empHours;
			//System.out.println("Salary of Employee on "+noOfDays+ "th Day is.."+salary);
			totalWage+=salary;
		}
		company.setTotalWage(totalWage);
		System.out.println("ToTal Salary of Employee is::"+ totalWage);
	}

}

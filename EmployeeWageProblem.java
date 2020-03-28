// Description : Employee Wage Problem
// Author : Roshan Balkrushna Shinde
// Since 28 March 2020 

public class EmployeeWageProblem{

public static final int IS_FULLTIME=1, IS_PARTTIME=2, WAGE_PER_HOUR=20;

	public static void main ( String args[] ){
		int checkNumber=(int)(Math.floor(Math.random()*10)%3);
		int salary=0, empHours=0;
	
		if ( checkNumber == IS_FULLTIME ){
			System.out.println("Employee Is Full Time..!");
			empHours=8;
		}
		else if ( checkNumber == IS_PARTTIME ){
			System.out.println("Employee Is Part Time..!");
			empHours=4;
		}
		else{
			System.out.println("Employee Is Absent..");
			empHours=0;
		}
		salary=empHours*WAGE_PER_HOUR;
		System.out.println("Salary of Employee is.."+salary);
	}
}

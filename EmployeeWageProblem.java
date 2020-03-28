// Description : Employee Wage Problem
// Author : Roshan Balkrushna Shinde
// Since 28 March 2020 

public class EmployeeWageProblem{

public static final int IS_FULLTIME=1, IS_PARTTIME=2, NOOFDAYS=20, WAGE_PER_HOUR=20;

	public static void main ( String args[] ){
		int totalSalary=0, salary=0;

		for ( int i=0; i<NOOFDAYS; i++ ){
			int checkNumber=(int)(Math.floor(Math.random()*10)%3);
			int empHours=0;
			switch (checkNumber){
				case IS_FULLTIME:
					System.out.println("Employee Is Full Time..!");
					empHours=8;
					break;
				case IS_PARTTIME:
					System.out.println("Employee Is Part Time..!");
					empHours=4;
					break;
				default:
					System.out.println("Employee Is Absent..");
					empHours=0;
					break;
			}
			salary=empHours*WAGE_PER_HOUR;
			System.out.println("Salary of Employee is.."+salary);
			totalSalary+=salary;
		}
		System.out.println("ToTal Salary of Employee is.."+ totalSalary);
	}

}

